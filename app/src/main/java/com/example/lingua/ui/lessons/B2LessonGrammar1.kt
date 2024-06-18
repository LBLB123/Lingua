package com.example.lingua.ui.lessons

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.CorrectAnswer
import com.example.lingua.LearningLanguage
import com.example.lingua.R
import com.example.lingua.WrongAnswer

class B2LessonGrammar1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = CorrectAnswer()
    private val class3 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b2_lesson_grammar1)
        class2.retry = 10
        class3.retry = 10
        languageChoice();
    }

    fun languageChoice(){
        when(class1.getLearningLang()){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }


    fun englishText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/GrammarLesson";
        textChange2.text = "You worked yesterday.";
        textChange3.text = "How would you write this sentence in\\npresent perfect continious tense?";
        button1.text = "You work yesterday."
        button2.text = "You are working yesterday."
        button3.text = "You have been working yesteday."
        button4.text = "You will be working yesterday."
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/GrammatikLektion";
        textChange2.text = "Du hast gestern gearbeitet.";
        textChange3.text = "Wie würdest du diesen Satz im\\nPräsens Perfekt Verlaufsform schreiben?";
        button1.text = "Du arbeitest gestern."
        button2.text = "Du hast gestern gearbeitet."
        button3.text = "Du hast gestern gearbeitet."
        button4.text = "Du wirst gestern arbeiten."
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/LicaoDeGramatica";
        textChange2.text = "Você trabalhou ontem.";
        textChange3.text = "Como você escreveria esta frase no\\npresente perfeito contínuo?";
        button1.text = "Você trabalha ontem."
        button2.text = "Você está trabalhando ontem."
        button3.text = "Você tem estado trabalhando ontem."
        button4.text = "Você estará trabalhando ontem."
    }

    fun wrongAnswer(view: View){
        val intent = Intent(this, WrongAnswer::class.java)
        startActivity(intent)
    }

    fun correctAnswer(view: View){
        val intent = Intent(this, CorrectAnswer::class.java)
        startActivity(intent)
    }

}