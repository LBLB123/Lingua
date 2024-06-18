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

class A1LessonVocabulary1 : AppCompatActivity() {

    private var complete : Int = 0;
    private var leftButton: Int = 0;
    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = CorrectAnswer()
    private val class4 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a1_lesson_vocabluary1)
        class3.retry = 3
        class4.retry = 3
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
        if(leftButton == 1){
            val button1 = findViewById<View>(R.id.Button1) as Button
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
        if(leftButton == 4){
            val button1 = findViewById<View>(R.id.Button4) as Button
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
        if(leftButton == 6){
            val button1 = findViewById<View>(R.id.Button6) as Button
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
        if(leftButton == 5){
            val button1 = findViewById<View>(R.id.Button5) as Button
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
        if(leftButton == 2){
            val button1 = findViewById<View>(R.id.Button2) as Button
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
        if(leftButton == 3){
            val button1 = findViewById<View>(R.id.Button3) as Button
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
        button1.text = "Quatro"
        button2.text = "Doze"
        button3.text = "Sete"
        button4.text = "Zero"
        button5.text = "Dez"
        button6.text = "Treze"

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
        textChange1.text = "Ordne die richtigen Wörter zu";
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
        textChange1.text = "Combine as palavras corretas";
        button1.text = "Quatro"
        button2.text = "Dez"
        button3.text = "Treze"
        button4.text = "Doze"
        button5.text = "Zero"
        button6.text = "Sete"
    }

}