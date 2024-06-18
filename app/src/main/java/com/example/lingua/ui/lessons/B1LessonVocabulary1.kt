package lessons

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

class B1LessonVocabulary1 : AppCompatActivity() {

    private val class1 = LearningLanguage()
    private val class2 = AppLanguage()
    private val class3 = AnswerControl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b1_lesson_vocabluary1)
        class3.retry = "a2_lesson_vocabulary1"
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
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
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
        textChange1.text = "";
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
        textChange1.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
    }

}