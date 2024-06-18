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

class B1LessonVocabulary1 : AppCompatActivity() {

    private var complete : Int = 0;
    private var leftButton: Int = 0;
    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = CorrectAnswer()
    private val class4 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b1_lesson_vocabulary1)
        class3.retry = 9
        class3.retry = 9
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
        val button1 = findViewById<View>(R.id.Button7) as Button
        button1.setBackgroundColor(Color.GRAY)
        leftButton = 7
    }

    fun buttonPress8(view: View?){
        if(leftButton == 6){
            val button1 = findViewById<View>(R.id.Button6) as Button
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
        if(complete == 7){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress9(view: View?){
        if(leftButton == 7){
            val button1 = findViewById<View>(R.id.Button7) as Button
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
        if(complete == 7){
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
        if(complete == 7){
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
        if(complete == 7){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress12(view: View?){
        if(leftButton == 4){
            val button1 = findViewById<View>(R.id.Button4) as Button
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
        if(complete == 7){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress13(view: View?){
        if(leftButton == 3){
            val button1 = findViewById<View>(R.id.Button3) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button13) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 7){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun buttonPress14(view: View?){
        if(leftButton == 1){
            val button1 = findViewById<View>(R.id.Button1) as Button
            button1.setBackgroundColor(Color.GREEN)
            val button2 = findViewById<View>(R.id.Button14) as Button
            button2.setBackgroundColor(Color.GREEN)
            complete += 1
        }
        else if (leftButton == 0){

        }
        else{
            val intent = Intent(this, WrongAnswer::class.java)
            startActivity(intent)
        }
        if(complete == 7){
            val intent = Intent(this, CorrectAnswer::class.java)
            startActivity(intent)
        }
        leftButton = 0
    }

    fun learningLanguageEnglish(){
        val button1 = findViewById<View>(R.id.Button8) as Button
        val button2 = findViewById<View>(R.id.Button9) as Button
        val button3 = findViewById<View>(R.id.Button10) as Button
        val button4 = findViewById<View>(R.id.Button11) as Button
        val button5 = findViewById<View>(R.id.Button12) as Button
        val button6 = findViewById<View>(R.id.Button13) as Button
        val button7 = findViewById<View>(R.id.Button14) as Button
        button1.text = "Swimsuit"
        button2.text = "Gravel"
        button3.text = "Towel"
        button4.text = "Sand"
        button5.text = "Sun Umbrella"
        button6.text = "Sun Cream"
        button7.text = "Beach"
    }

    fun learningLanguageGerman(){
        val button1 = findViewById<View>(R.id.Button8) as Button
        val button2 = findViewById<View>(R.id.Button9) as Button
        val button3 = findViewById<View>(R.id.Button10) as Button
        val button4 = findViewById<View>(R.id.Button11) as Button
        val button5 = findViewById<View>(R.id.Button12) as Button
        val button6 = findViewById<View>(R.id.Button13) as Button
        val button7 = findViewById<View>(R.id.Button14) as Button
        button1.text = "Badenanzug"
        button2.text = "Kies"
        button3.text = "Handtuch"
        button4.text = "Sand"
        button5.text = "Sonnenschirm"
        button6.text = "Sonnencreme"
        button7.text = "Strand"
    }

    fun learningLanguagePortuguese(){
        val button1 = findViewById<View>(R.id.Button8) as Button
        val button2 = findViewById<View>(R.id.Button9) as Button
        val button3 = findViewById<View>(R.id.Button10) as Button
        val button4 = findViewById<View>(R.id.Button11) as Button
        val button5 = findViewById<View>(R.id.Button12) as Button
        val button6 = findViewById<View>(R.id.Button13) as Button
        val button7 = findViewById<View>(R.id.Button14) as Button
        button1.text = "Maiô"
        button2.text = "Cascalho"
        button3.text = "Toalha"
        button4.text = "Areia"
        button5.text = "Guarda-sol"
        button6.text = "Protetor solar"
        button7.text = "Praia"
    }

    fun appLanguageEnglish(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        val button7 = findViewById<View>(R.id.Button7) as Button
        textChange1.text = "Match the right words";
        button1.text = "Beach"
        button2.text = "Sand"
        button3.text = "Sun Cream"
        button4.text = "Sun Umbrella"
        button5.text = "Towel"
        button6.text = "Swimsuit"
        button7.text = "Gravel"
    }

    fun appLanguageGerman(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        val button7 = findViewById<View>(R.id.Button7) as Button
        textChange1.text = "Ordne die richtigen Wörter zu";
        button1.text = "Strand"
        button2.text = "Sand"
        button3.text = "Sonnencreme"
        button4.text = "Sonnenschirm"
        button5.text = "Handtuch"
        button6.text = "Badeanzug"
        button7.text = "Kies"
    }

    fun appLanguagePortuguese(){
        val textChange1 = findViewById<TextView>(R.id.words)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        val button5 = findViewById<View>(R.id.Button5) as Button
        val button6 = findViewById<View>(R.id.Button6) as Button
        val button7 = findViewById<View>(R.id.Button7) as Button
        textChange1.text = "Combine as palavras corretas";
        button1.text = "Praia"
        button2.text = "Areia"
        button3.text = "Protetor solar"
        button4.text = "Guarda-sol"
        button5.text = "Toalha"
        button6.text = "Maiô"
        button7.text = "Cascalho"
    }

}