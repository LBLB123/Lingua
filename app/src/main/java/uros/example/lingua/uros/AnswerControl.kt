package com.example.mobilecomputing

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class AnswerControl : AppCompatActivity() {
    fun wrongAnswer(view: View){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }

    fun correctAnswer(view: View){
        val intent = Intent(this, CorrectAnswer::class.java)
        startActivity(intent)
    }

    fun retry(view: View?){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }

    fun exit(view: View?){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }
}