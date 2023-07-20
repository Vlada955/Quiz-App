package com.vladimir.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.vladimir.quizapp.databinding.ActivityQuizQuestionsBinding
import java.lang.reflect.Type
import kotlin.properties.Delegates
import java.util.logging.Handler as Handler1

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityQuizQuestionsBinding
    private var mCurrentPosition = 1
    private var randomNumberGetter = 0
    private var i = 0
    private var firstEntry = 0
    private var generatedRandomNumbers = HashMap<Int, Int>()
    private var mQuestionsList: ArrayList<Question>? = null
    private var mUserName: String? = null
    private var mCorrectAnswers: Int = 0
    private var mSelectedOptionPosition: Int = 0

    private var progressBar: ProgressBar? = null
    private var textViewProgress: TextView? = null
    private var textViewQuestion: TextView? = null
    private var imageViewImage: ImageView? = null
    private var textViewOptionOne: TextView? = null
    private var textViewOptionTwo: TextView? = null
    private var textViewOptionThree: TextView? = null
    private var textViewOptionFour: TextView? = null
    private var buttonSubmit: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = binding.progressBar
        textViewProgress = binding.textViewProgress
        textViewQuestion = binding.textViewQuestion
        imageViewImage = binding.imageViewQuestionImage
        textViewOptionOne = binding.textViewOptionOne
        textViewOptionTwo = binding.textViewOptionTwo
        textViewOptionThree = binding.textViewOptionThree
        textViewOptionFour = binding.textViewOptionFour
        buttonSubmit = binding.buttonSubmit

        textViewOptionOne?.setOnClickListener(this)
        textViewOptionTwo?.setOnClickListener(this)
        textViewOptionThree?.setOnClickListener(this)
        textViewOptionFour?.setOnClickListener(this)
        buttonSubmit?.setOnClickListener(this)

        mQuestionsList = Constants.getQuestion()
        setQuestion()


    }


    private fun setQuestion() {
        defaultOptionsView()
        var lastNumber = mQuestionsList?.size
        var randomNumber = (1 until lastNumber!!).random()
        randomNumberGetter = randomNumber
        if (firstEntry == 0) {
            val question: Question =
                mQuestionsList!![randomNumberGetter] // In case mCurrentPosition is 1 we will get question1 with index 0
            imageViewImage?.setImageResource(question.image)
            progressBar?.progress = mCurrentPosition
            textViewProgress?.text = "$mCurrentPosition / ${progressBar?.max}"
            textViewQuestion?.text = question.question
            textViewOptionOne?.text = question.optionOne
            textViewOptionTwo?.text = question.optionTwo
            textViewOptionThree?.text = question.optionThree
            textViewOptionFour?.text = question.optionFour
            generatedRandomNumbers.put(i, randomNumber)
            firstEntry = 1
            i++
        } else if (!generatedRandomNumbers.containsValue(randomNumber) && firstEntry == 1) {
            val question: Question =
                mQuestionsList!![randomNumberGetter] // In case mCurrentPosition is 1 we will get question1 with index 0
            imageViewImage?.setImageResource(question.image)
            progressBar?.progress = mCurrentPosition
            textViewProgress?.text = "$mCurrentPosition / ${progressBar?.max}"
            textViewQuestion?.text = question.question
            textViewOptionOne?.text = question.optionOne
            textViewOptionTwo?.text = question.optionTwo
            textViewOptionThree?.text = question.optionThree
            textViewOptionFour?.text = question.optionFour
            generatedRandomNumbers.put(i, randomNumber)
            i++
        } else if (generatedRandomNumbers.containsValue(randomNumber)) {
            setQuestion()
        }

        if (mCurrentPosition != 9) {
            buttonSubmit?.text = "SUBMIT"
        } else {
            buttonSubmit?.text = "FINISH"
        }
    }


    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        textViewOptionOne?.let {
            options.add(0, it)
        }
        textViewOptionTwo?.let {
            options.add(1, it)
        }
        textViewOptionThree?.let {
            options.add(2, it)
        }
        textViewOptionFour?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }


    private fun selectedOptionView(textView: TextView, selectedOptionNumber: Int) {
        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNumber
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.text_view_option_one -> {
                textViewOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.text_view_option_two -> {
                textViewOptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.text_view_option_three -> {
                textViewOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.text_view_option_four -> {
                textViewOptionFour?.let {
                    selectedOptionView(it, 4)
                }
            }

            R.id.button_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= 9 -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList?.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(randomNumberGetter)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

//                        if (mCurrentPosition == 9) {
//                            buttonSubmit?.text = "FINISH"
//                        } else {
//                            buttonSubmit?.text = "GO TO NEXT QUESTION"
                    val handler = Handler() //Delays the click of the button
                    handler.postDelayed({
                        buttonSubmit?.performClick() //Click the button again so it would automatically go to next question
                    }, 1000)

                }

                mSelectedOptionPosition = 0
            }
        }
    }


    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                textViewOptionOne?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                textViewOptionTwo?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                textViewOptionThree?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                textViewOptionFour?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }

        }
    }
}