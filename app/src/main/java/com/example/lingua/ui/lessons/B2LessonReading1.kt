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

class B2LessonReading1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = CorrectAnswer()
    private val class3 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b2_lesson_reading1)
        class2.retry = 11
        class3.retry = 11
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
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/ReadingLesson";
        textChange2.text = "Your co-worker invites you to a celebration at 8pm on Saturday.";
        textChange3.text = "How do you politely refuse?";
        button1.text = "Sorry, I won't be able to attend your celbration."
        button2.text = "I have something to take care of."
        button3.text = "Sure, I will come to your celebration."
        button4.text = "I will be able to attend."
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/Leselektion";
        textChange2.text = "Dein Kollege lädt dich zu einer Feier um 20 Uhr am Samstag ein.";
        textChange3.text = "Wie würdest du höflich ablehnen?";
        button1.text = "Entschuldigung, ich kann nicht an deiner Feier teilnehmen."
        button2.text = "Ich habe etwas zu erledigen."
        button3.text = "Sicher, ich werde zu deiner Feier kommen."
        button4.text = "Ich werde teilnehmen können."
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/LicaoDeLeitura";
        textChange2.text = "Seu colega te convida para uma celebração às 20h no sábado.";
        textChange3.text = "Como você recusaria educadamente?";
        button1.text = "Desculpe, não poderei comparecer à sua celebração."
        button2.text = "Eu tenho algo para resolver."
        button3.text = "Claro, eu irei para sua celebração."
        button4.text = "Eu poderei comparecer."
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