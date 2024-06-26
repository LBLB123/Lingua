package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LanguageLevel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.language_level)
        languageChoice();
    }

    private val class1 = AppLanguage()

    fun languageChoice(){
          when(class1.getAppLang()){
              'E' -> englishText()
              'G' -> germanText()
              'P' -> portugueseText()
          }
    }

    fun englishText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.A1) as Button
        val button2 = findViewById<View>(R.id.A2) as Button
        val button3 = findViewById<View>(R.id.B1) as Button
        val button4 = findViewById<View>(R.id.B2) as Button
        val button5 = findViewById<View>(R.id.Continue) as Button
        textChange.text = "What is your language level?";
        button1.text = "A1 Beginner Level"
        button2.text = "A2 Elementary Level"
        button3.text = "B1 Intermediate Level"
        button4.text = "B2 Advanced Level"
        button5.text = "Continue"
    }

    fun germanText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.A1) as Button
        val button2 = findViewById<View>(R.id.A2) as Button
        val button3 = findViewById<View>(R.id.B1) as Button
        val button4 = findViewById<View>(R.id.B2) as Button
        val button5 = findViewById<View>(R.id.Continue) as Button
        textChange.text = "Wie ist dein Sprachniveau?";
        button1.text = "A1 Anfängerniveau"
        button2.text = "A2 Grundstufenniveau"
        button3.text = "B1 Mittelstufenniveau"
        button4.text = "B2 Fortgeschrittenes Niveau"
        button5.text = "Weiter"
    }

    fun portugueseText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.A1) as Button
        val button2 = findViewById<View>(R.id.A2) as Button
        val button3 = findViewById<View>(R.id.B1) as Button
        val button4 = findViewById<View>(R.id.B2) as Button
        val button5 = findViewById<View>(R.id.Continue) as Button
        textChange.text = "Qual é o seu nível de idioma?"
        button1.text = "A1 Nível Iniciante"
        button2.text = "A2 Nível Elementar"
        button3.text = "B1 Nível Intermediário"
        button4.text = "B2 Nível Avançado"
        button5.text = "Continuar"
    }

    fun continueButton(view: View?){
        val intent = Intent(this, StartPage::class.java)
        startActivity(intent)
    }
}