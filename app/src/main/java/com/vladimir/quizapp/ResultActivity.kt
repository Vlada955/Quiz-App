package com.vladimir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vladimir.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textViewName = binding.textViewName
        val textViewScore = binding.textViewScore
        val buttonFinish = binding.buttonFinish
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)


//        val sortedScores = scores.toList().sortedBy { (_, value) -> value}.toMap().to
//        binding.textViewFirstUserScore.text = sortedScores[0]


        textViewName.text = "Hey ${intent.getStringExtra(Constants.USER_NAME)}"


        if (correctAnswers <= 3) {
            textViewScore.text = "Your score is $correctAnswers out of 9, try again!"
        } else if (correctAnswers <= 6) {
            textViewScore.text = "Your score is $correctAnswers out of 9, great!"
        } else if (correctAnswers <= 8) {
            textViewScore.text = "Your score is $correctAnswers out of 9, excellent!"
        } else {
            textViewScore.text = "Your score is $correctAnswers out of 9, you rock!"
        }

//
//        userIdName[Constants.USER_ID] = Constants.USER_NAME
//        userIdScore[Constants.USER_ID] = Constants.CORRECT_ANSWERS
//        textViewFirstUserScoreName.text = userIdName[Constants.USER_ID].toString()
//        textViewFirstUserScore.text = userIdScore[Constants.USER_ID].toString()


//        scores.put(userName!!, correctAnswers)
//        scores["$userName"] = correctAnswers
//
//        val sortedScores = scores.toList().sortedByDescending { (_, score) -> score}.toMap()
        buttonFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}
