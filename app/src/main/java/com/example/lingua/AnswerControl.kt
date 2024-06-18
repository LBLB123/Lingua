package com.example.lingua

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AnswerControl : AppCompatActivity() {

    var retry : String = "";

    fun wrongAnswer(view: View){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }

    fun correctAnswer(view: View){
        val intent = Intent(this, CorrectAnswer::class.java)
        startActivity(intent)
    }

    fun retry(view: View?){
        val intent = Intent(this, retry::class.java)
        startActivity(intent)
    }

    fun exit(view: View?){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }
}