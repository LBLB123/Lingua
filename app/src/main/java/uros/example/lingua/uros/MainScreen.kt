package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_screen)
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
        val textChange = findViewById<TextView>(R.id.Welcome)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        textChange.text = "Welcome!";
        button1.text = "Continue where you left off"
        button2.text = "Choose a language level"
    }

    fun germanText(){
        val textChange = findViewById<TextView>(R.id.Welcome)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        textChange.text = "Willkommen"
        button1.text = ""
        button2.text = ""
    }

    fun portugueseText(){
        val textChange = findViewById<TextView>(R.id.Welcome)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        textChange.text = ""
        button1.text = ""
        button2.text = ""
    }

    fun settings(view: View?){
        val intent = Intent(this, Settings::class.java)
        startActivity(intent)
    }

}