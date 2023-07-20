package com.vladimir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
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

        // Save the user's score

        val userName = intent.getStringExtra(Constants.USER_NAME)
        saveScore(userName!!, correctAnswers)

        //Get the top 5 answers
        val topFiveScores = getTopFiveScores()

        //Update the UI with top 5 scores
        val scoreViews = listOf(
            binding.textViewFirstUserScore,
            binding.textViewSecondUserScore,
            binding.textViewThirdUserScore,
            binding.textViewFourthUserScore,
            binding.textViewFifthUserScore
        )

        val nameViews = listOf(
            binding.textViewFirstUserScoreName,
            binding.textViewSecondUserScoreName,
            binding.textViewThirdUserScoreName,
            binding.textViewFourthUserScoreName,
            binding.textViewFifthUserScoreName
        )

        for (i in 0 until topFiveScores.size) {
            val (name, scoresList) = topFiveScores[i]
            nameViews[i].text = name
            scoreViews[i].text = scoresList.toString()
        }


        buttonFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    //Save the score and user name
    private fun saveScore(userName: String, score: Int) {
        val prefs = getSharedPreferences("quiz_scores", MODE_PRIVATE)
        val scoresJson = prefs.getString(userName, null)
        val scoresList = scoresJson?.let { Gson().fromJson(it, List::class.java) } as? MutableList<Double> ?: mutableListOf()
        scoresList.add(score.toDouble()) // Convert Int score to Double before adding
        val editor = prefs.edit()
        editor.putString(userName, Gson().toJson(scoresList))
        editor.apply()
    }

    // Get top 5 users
    private fun getTopFiveScores(): List<Pair<String, Double>> {
        val prefs = getSharedPreferences("quiz_scores", MODE_PRIVATE)
        val scoresMap = prefs.all
        val topFiveScores = scoresMap.entries
            .map { entry ->
                val userName = entry.key
                val scoresJson = entry.value as? String
                val scoresList = scoresJson?.let { Gson().fromJson(it, List::class.java) } as? List<Double>
                val maxScore = scoresList?.maxOrNull() ?: 0.0 // Initialize as 0.0
                Pair(userName, maxScore)
            }
            .sortedByDescending { (_, maxScore) -> maxScore }
            .take(5)
        return topFiveScores
    }

    }
