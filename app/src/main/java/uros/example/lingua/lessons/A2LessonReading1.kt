package lessons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilecomputing.R

class A2LessonReading1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a2_lesson_reading1)
        languageChoice();
    }

    private val class1 = LearningLanguage()

    fun languageChoice(){
        when(class1.learningLang){
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
        textChange1.text = "";
        textChange2.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "";
        textChange2.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
    }

}