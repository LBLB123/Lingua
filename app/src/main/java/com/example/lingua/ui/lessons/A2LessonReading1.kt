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

class A2LessonReading1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = CorrectAnswer()
    private val class3 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a2_lesson_reading1)
        class2.retry = 5
        class3.retry = 5
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
        textChange1.text = "Reading Lesson";
        textChange2.text = "How would you politely ask for a bottle of water in a store?";
        button1.text = "Can I get this chips?"
        button2.text = "Can I get this bottle of water please?"
        button3.text = "Can I get a bottle of water?"
        button4.text = "Where do you leave your water bottles?"
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Leselektion";
        textChange2.text = "Wie würdest du höflich nach einer Flasche Wasser in einem Geschäft fragen?";
        button1.text = "Kann ich diese Chips bekommen?"
        button2.text = "Kann ich bitte diese Flasche Wasser bekommen?"
        button3.text = "Kann ich eine Flasche Wasser bekommen?"
        button4.text = "Wo habt ihr eure Wasserflaschen?"
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Lição de Leitura";
        textChange2.text = "Como você pediria educadamente uma garrafa de água em uma loja?";
        button1.text = "Posso pegar esses salgadinhos?"
        button2.text = "Posso pegar esta garrafa de água, por favor?"
        button3.text = "Posso pegar uma garrafa de água?"
        button4.text = "Onde você guarda suas garrafas de água?"
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