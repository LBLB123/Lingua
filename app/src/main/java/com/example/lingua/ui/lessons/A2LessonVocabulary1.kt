package com.example.lingua.ui.lessons

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.AppLanguage
import com.example.lingua.CorrectAnswer
import com.example.lingua.LearningLanguage
import com.example.lingua.R
import com.example.lingua.WrongAnswer

class A2LessonVocabulary1 : AppCompatActivity() {

    private var complete : Int = 0;
    private var leftButton: Int = 0;
    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = CorrectAnswer()
    private val class4 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a2_lesson_vocabluary1)
        class3.retry = 6
        class4.retry = 6
        learningLanguageChoice();
        appLanguageChoice();
    }

    fun learningLanguageChoice(){
        when(class1.getLearningLang()){
            'E' -> learningLanguageEnglish()
            'G' -> learningLanguageGerman()
            'P' -> learningLanguagePortuguese()
        }
    }

    fun appLanguageChoice(){
        when(class2.getAppLang()){
            'E' -> appLanguageEnglish()
            'G' -> appLanguageGerman()
            'P' -> appLanguagePortuguese()
        }
    }

    fun buttonPress1(view: View?){
        val button1 = findViewById<View>(R.id.Button1) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 1
    }

    fun buttonPress2(view: View?){
        val button1 = findViewById<View>(R.id.Button2) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 2
    }

    fun buttonPress3(view: View?){
        val button1 = findViewById<View>(R.id.Button3) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 3
    }

    fun buttonPress4(view: View?){
        val button1 = findViewById<View>(R.id.Button4) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 4
    }

    fun buttonPress5(view: View?){
        val button1 = findViewById<View>(R.id.Button5) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 5
    }

    fun buttonPress6(view: View?){
        val button1 = findViewById<View>(R.id.Button6) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 6
    }

    fun buttonPress7(view: View?){
        if(leftButton == 4){
            val button1 = findViewById<View>(R.id.Button4) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button7) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress8(view: View?){
        if(leftButton == 5){
            val button1 = findViewById<View>(R.id.Button5) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button8) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress9(view: View?){
        if(leftButton == 3){
            val button1 = findViewById<View>(R.id.Button3) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button9) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress10(view: View?){
        if(leftButton == 6){
            val button1 = findViewById<View>(R.id.Button6) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button10) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress11(view: View?){
        if(leftButton == 1){
            val button1 = findViewById<View>(R.id.Button1) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button11) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress12(view: View?){
        if(leftButton == 2){
            val button1 = findViewById<View>(R.id.Button2) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button12) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 6){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
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
        button1.text = "Pêssego"
        button2.text = "Melancia"
        button3.text = "Morango"
        button4.text = "Maçã"
        button5.text = "Abacaxi"
        button6.text = "Mirtilo"
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
        textChange1.text = "Ordne die richtigen Wörter zu";
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
        textChange1.text = "Combine as palavras corretas";
        button1.text = "Abacaxi"
        button2.text = "Mirtilo"
        button3.text = "Morango"
        button4.text = "Pêssego"
        button5.text = "Melancia"
        button6.text = "Maçã"
    }

}