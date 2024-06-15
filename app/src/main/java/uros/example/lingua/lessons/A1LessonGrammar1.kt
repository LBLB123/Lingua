package lessons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilecomputing.AppLanguage
import com.example.mobilecomputing.R

class A1LessonGrammar1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.a1_lesson_grammar1)
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
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "Reading Lesson";
        textChange2.text = "I wake up at 8am every day.";
        textChange3.text = "How would you write this sentence in\\nsimple past tense?";
        button1.text = "I will wake up at 8am every day."
        button2.text = "I had been waking up at 8am every  day."
        button3.text = "I woke up at 8am every day."
        button4.text = "I was waking up at 8am every day."
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "";
        textChange2.text = "";
        textChange3.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
    }

    fun portugueseText(){
        val textChange1 = findViewById<TextView>(R.id.GrammarLesson)
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "";
        textChange2.text = "";
        textChange3.text = "";
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
    }

}