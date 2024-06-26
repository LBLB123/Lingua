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

class A1LessonGrammar1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = CorrectAnswer()
    private val class3 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a1_lesson_grammar1)
        class2.retry = 1
        class3.retry = 1
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
        textChange1.text = "Grammar Lesson";
        textChange2.text = "I wake up at 8am every day.";
        textChange3.text = "How would you write this sentence in simple past tense?";
        button1.text = "I will wake up at 8am every day."
        button2.text = "I had been waking up at 8am every  day."
        button3.text = "I woke up at 8am every day."
        button4.text = "I was waking up at 8am every day."
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Grammatik Lektion";
        textChange2.text = "Ich wache jeden Tag um 8 Uhr auf.";
        textChange3.text = "Wie würdest du diesen Satz im Präteritum schreiben?";
        button1.text = "Ich werde jeden Tag um 8 Uhr aufwachen."
        button2.text = "Ich bin jeden Tag um 8 Uhr aufgewacht."
        button3.text = "Ich wachte jeden Tag um 8 Uhr auf."
        button4.text = "Ich war jeden Tag um 8 Uhr am Aufwachen."

    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Lição de Gramática";
        textChange2.text = "Eu acordo às 8h todos os dias.";
        textChange3.text = "Como você escreveria esta frase no passado simples?";
        button1.text = "Eu vou acordar às 8h todos os dias."
        button2.text = "Eu estava acordando às 8h todos os dias."
        button3.text = "Eu acordei às 8h todos os dias."
        button4.text = "Eu estava acordando às 8h todos os dias."

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