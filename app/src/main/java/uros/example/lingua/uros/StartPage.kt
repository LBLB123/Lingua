package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class StartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.startpage)
        langaugeChoice();
    }

    private val class1 = Language1()

    fun langaugeChoice(){
        when(class1.lang){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }

    fun englishText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = "Continue"
    }

    fun germanText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = "Weiter"
    }

    fun portugueseText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = ""
    }

    fun continueButton(view: View?){
        val intent = Intent(this, MainScreen::class.java)
        startActivity(intent)
    }
    
}