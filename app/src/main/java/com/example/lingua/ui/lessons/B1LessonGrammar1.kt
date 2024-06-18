package com.example.lingua.ui.lessons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.AnswerControl
import com.example.lingua.LearningLanguage
import com.example.lingua.R

class B1LessonGrammar1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = AnswerControl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b1_lesson_grammar1)
        class2.retry = "b1_lesson_grammar1"
        languageChoice();
    }

    fun languageChoice(){
        when(class1.learningLang){
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
        textChange2.text = "I have a headache";
        textChange3.text = "How would you write this sentence in\\npast continius tense?";
        button1.text = "I had a headache"
        button2.text = "I was having a heading."
        button3.text = "I'm having a headache."
        button4.text = "I have had a headache."
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
        textChange2.text = "Ich habe Kopfschmerzen";
        textChange3.text = "Wie würdest du diesen Satz im\\nVerlaufsform der Vergangenheit schreiben?";
        button1.text = "Ich hatte Kopfschmerzen"
        button2.text = "Ich hatte Kopfschmerzen."
        button3.text = "Ich habe Kopfschmerzen."
        button4.text = "Ich habe Kopfschmerzen gehabt."
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
        textChange2.text = "Estou com dor de cabeça";
        textChange3.text = "Como você escreveria esta frase no\\npassado contínuo?";
        button1.text = "Eu estava com dor de cabeça"
        button2.text = "Eu estava com dor de cabeça."
        button3.text = "Estou com dor de cabeça."
        button4.text = "Eu tive dor de cabeça."
    }

}