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

class A1LessonReading1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = AnswerControl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a1_lesson_reading1)
        class2.retry = "a1_lesson_reading1"
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
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Grammar Lesson";
        textChange2.text = "How would you answer?";
        textChange3.text = "Someone asks you how old you are.";
        button1.text = "I'm ..."
        button2.text = "My name is ..."
        button3.text = "I am ... years old."
        button4.text = "How old are you?"
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Grammatik Lektion";
        textChange2.text = "Wie würdest du antworten?";
        textChange3.text = "Jemand fragt dich, wie alt du bist.";
        button1.text = "Ich bin ..."
        button2.text = "Mein Name ist ..."
        button3.text = "Ich bin ... Jahre alt."
        button4.text = "Wie alt bist du?"
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Lição de Gramática";
        textChange2.text = "Como você responderia?";
        textChange3.text = "Alguém pergunta quantos anos você tem.";
        button1.text = "Eu tenho ..."
        button2.text = "Meu nome é ..."
        button3.text = "Eu tenho ... anos."
        button4.text = "Quantos anos você tem?"
    }

}