package lessons

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

class B2LessonVocabulary1 : AppCompatActivity() {

    private var complete : Int = 0;
    private var leftButton: Int = 0;
    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = CorrectAnswer()
    private val class4 = WrongAnswer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b2_lesson_vocabluary1)
        class3.retry = 12
        class4.retry = 12
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
        if(leftButton == 2){
            val button1 = findViewById<View>(R.id.Button2) as Button
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
        button1.text = "Chicken"
        button2.text = "Fish"
        button3.text = "Mutton"
        button4.text = "Pork"
        button5.text = "Beef"
        button6.text = "Lamb"
    }

    fun learningLanguageGerman(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = "Huhn"
        button2.text = "Fisch"
        button3.text = "Lammfleisch"
        button4.text = "Schweinefleisch"
        button5.text = "Rindfleisch"
        button6.text = "Lamm"
    }

    fun learningLanguagePortuguese(){
        val button1 = findViewById<View>(R.id.Button7) as Button
        val button2 = findViewById<View>(R.id.Button8) as Button
        val button3 = findViewById<View>(R.id.Button9) as Button
        val button4 = findViewById<View>(R.id.Button10) as Button
        val button5 = findViewById<View>(R.id.Button11) as Button
        val button6 = findViewById<View>(R.id.Button12) as Button
        button1.text = "Frango"
        button2.text = "Peixe"
        button3.text = "Carneiro"
        button4.text = "Porco"
        button5.text = "Carne bovina"
        button6.text = "Cordeiro"
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
        button1.text = "Beef"
        button2.text = "Pork"
        button3.text = "Lamb"
        button4.text = "Chicken"
        button5.text = "Fish"
        button6.text = "Mutton"
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
        button1.text = "Rindfleisch"
        button2.text = "Schweinefleisch"
        button3.text = "Lamm"
        button4.text = "Huhn"
        button5.text = "Fisch"
        button6.text = "Lammfleisch"
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
        button1.text = "Carne bovina"
        button2.text = "Porco"
        button3.text = "Cordeiro"
        button4.text = "Frango"
        button5.text = "Peixe"
        button6.text = "Carneiro"
    }

}