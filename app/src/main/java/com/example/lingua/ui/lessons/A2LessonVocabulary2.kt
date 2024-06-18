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

class A2LessonVocabulary2 : AppCompatActivity() {

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
        button1.text = "Peach"
        button2.text = "Watermelon"
        button3.text = "Strawberry"
        button4.text = "Apple"
        button5.text = "Pineapple"
        button6.text = "Blueberry"
    }

    fun learningLanguageGerman(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = "Pfirsch"
        button2.text = "Wassermelone"
        button3.text = "Erdberre"
        button4.text = "Apfel"
        button5.text = "Ananas"
        button6.text = "Blauberre"
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
        button1.text = "Pineapple"
        button2.text = "Blueberry"
        button3.text = "Strawberry"
        button4.text = "Peach"
        button5.text = "Watermelon"
        button6.text = "Apple"
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
        button1.text = "Ananas"
        button2.text = "Blauberre"
        button3.text = "Erdberre"
        button4.text = "Pfirsch"
        button5.text = "Wassermelone"
        button6.text = "Apfel"
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