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

class B1LessonReading1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = CorrectAnswer()
    private val class3 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b1_lesson_reading1)
        class2.retry = 8
        class3.retry = 8
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
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/ReadingLesson";
        textChange2.text = "A friend asks you about how was your morning.";
        button1.text = "I slept well."
        button2.text = "I woke up feeling rested and I was happy to start my day."
        button3.text = "It's really nice out."
        button4.text = "How was your morning?"
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/Lesestunde";
        textChange2.text = "Ein Freund fragt dich, wie deine Morgen war.";
        button1.text = "Ich habe gut geschlafen."
        button2.text = "Ich bin ausgeruht aufgewacht und war froh, meinen Tag zu beginnen."
        button3.text = "Das Wetter ist wirklich schön."
        button4.text = "Wie war dein Morgen?"
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/LicaoDeLeitura";
        textChange2.text = "Um amigo pergunta como foi sua manhã.";
        button1.text = "Eu dormi bem."
        button2.text = "Acordei me sentindo descansado e feliz para começar o dia."
        button3.text = "O dia está realmente bonito."
        button4.text = "Como foi sua manhã?"
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