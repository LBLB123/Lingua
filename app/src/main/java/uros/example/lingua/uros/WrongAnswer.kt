package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WrongAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.wrong_answer)
        langaugeChoice()
    }

    private val class1 = AppLanguage()

    fun langaugeChoice(){
        when(class1.appLang){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }

    fun englishText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Your answer is wrong!";
        button1.text = "Retry"
        button2.text = "Exit"
    }

    fun germanText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Dein Antwort ist falsch!";
        button1.text = "Wiederholen"
        button2.text = "Verlassen"
    }

    fun portugueseText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Your answer is wrong!";
        button1.text = "Retry"
        button2.text = "Exit"
    }

}