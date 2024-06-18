package com.example.lingua.ui.lessons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.AnswerControl
import com.example.lingua.AppLanguage
import com.example.lingua.LearningLanguage
import com.example.lingua.R

class A1LessonVocabulary1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = AnswerControl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a1_lesson_vocabluary1)
        class3.retry = "a1_lesson_grammar1"
        learningLanguageChoice();
        appLanguageChoice();
    }

    fun learningLanguageChoice(){
        when(class1.learningLang){
            'E' -> learningLanguageEnglish()
            'G' -> learningLanguageGerman()
            'P' -> learningLanguagePortuguese()
        }
    }

    fun appLanguageChoice(){
        when(class2.appLang){
            'E' -> appLanguageEnglish()
            'G' -> appLanguageGerman()
            'P' -> appLanguagePortuguese()
        }
    }

    fun learningLanguageEnglish(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = "Four"
        button2.text = "Twelve"
        button3.text = "Seven"
        button4.text = "Zero"
        button5.text = "Ten"
        button6.text = "Thirteen"
    }

    fun learningLanguageGerman(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = "Vier"
        button2.text = "Zwölf"
        button3.text = "Sieben"
        button4.text = "Null"
        button5.text = "Zehn"
        button6.text = "Dreizehn"
    }

    fun learningLanguagePortuguese(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
    }

    fun appLanguageEnglish(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        textChange1.text = "Match the right words";
        button1.text = "Four"
        button2.text = "Ten"
        button3.text = "Thirteen"
        button4.text = "Twelve"
        button5.text = "Zero"
        button6.text = "Seven"
    }

    fun appLanguageGerman(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        textChange1.text = "";
        button1.text = "Vier"
        button2.text = "Zehn"
        button3.text = "Dreizehn"
        button4.text = "Zwölf"
        button5.text = "Null"
        button6.text = "Sieben"
    }

    fun appLanguagePortuguese(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        textChange1.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
    }

}