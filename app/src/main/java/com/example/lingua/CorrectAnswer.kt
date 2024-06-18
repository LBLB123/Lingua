package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.AppLanguage
import com.example.lingua.ui.lessons.A1LessonGrammar1
import com.example.lingua.ui.lessons.A1LessonReading1
import com.example.lingua.ui.lessons.A1LessonVocabulary1
import com.example.lingua.ui.lessons.A2LessonGrammar1
import com.example.lingua.ui.lessons.A2LessonReading1
import com.example.lingua.ui.lessons.A2LessonVocabulary1
import com.example.lingua.ui.lessons.B1LessonGrammar1
import com.example.lingua.ui.lessons.B1LessonReading1
import com.example.lingua.ui.lessons.B2LessonGrammar1
import com.example.lingua.ui.lessons.B2LessonReading1
import lessons.B1LessonVocabulary1
import lessons.B2LessonVocabulary1

class CorrectAnswer : AppCompatActivity() {

    var retry : Int = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.correct_answer)
        langaugeChoice()
    }

    private val class1 = AppLanguage()

    fun langaugeChoice(){
        when(class1.getAppLang()){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }

    fun englishText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Your answer is correct!";
        button1.text = "Retry"
        button2.text = "Exit"
    }

    fun germanText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Dein Antwort ist richtig!";
        button1.text = "Wiederholen"
        button2.text = "Verlassen"
    }

    fun portugueseText(){
        val textChange = findViewById<TextView>(R.id.Text)
        val button1 = findViewById<View>(R.id.Retry) as Button
        val button2 = findViewById<View>(R.id.Exit) as Button
        textChange.text = "Your answer is wrong!";
        button1.text = "Retry"
        button2.text = "Exit"
    }

    fun chooseActivity(view: View){

        when(retry){
            1 -> {
                val intent = Intent(this, A1LessonGrammar1::class.java)
                startActivity(intent)
            }
            2 -> {
                val intent = Intent(this, A1LessonReading1::class.java)
                startActivity(intent)
            }
            3 -> {
                val intent = Intent(this, A1LessonVocabulary1::class.java)
                startActivity(intent)
            }
            4 -> {
                val intent = Intent(this, A2LessonGrammar1::class.java)
                startActivity(intent)
            }
            5 -> {
                val intent = Intent(this, A2LessonReading1::class.java)
                startActivity(intent)
            }
            6 -> {
                val intent = Intent(this, A2LessonVocabulary1::class.java)
                startActivity(intent)
            }
            7 -> {
                val intent = Intent(this, B1LessonGrammar1::class.java)
                startActivity(intent)
            }
            8 -> {
                val intent = Intent(this, B1LessonReading1::class.java)
                startActivity(intent)
            }
            9 -> {
                val intent = Intent(this, B1LessonVocabulary1::class.java)
                startActivity(intent)
            }
            10 -> {
                val intent = Intent(this, B2LessonGrammar1::class.java)
                startActivity(intent)
            }
            11 -> {
                val intent = Intent(this, B2LessonReading1::class.java)
                startActivity(intent)
            }
            12 -> {
                val intent = Intent(this, B2LessonVocabulary1::class.java)
                startActivity(intent)
            }
        }
    }

    fun exit(view: View?){
        val intent = Intent(this, StartPage::class.java)
        startActivity(intent)
    }

}