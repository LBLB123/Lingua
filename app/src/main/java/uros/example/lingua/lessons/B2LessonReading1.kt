package lessons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilecomputing.R

class B2LessonReading1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.b2_lesson_reading1)
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
        val textChange2 = findViewById<TextView>(R.id.Sentence1)
        val textChange3 = findViewById<TextView>(R.id.Sentence2)
        val button1 = findViewById<View>(R.id.Button1) as Button
        val button2 = findViewById<View>(R.id.Button2) as Button
        val button3 = findViewById<View>(R.id.Button3) as Button
        val button4 = findViewById<View>(R.id.Button4) as Button
        textChange1.text = "@string/ReadingLesson";
        textChange2.text = "Your co-worker invites you to a celebration at 8pm on Saturday.";
        textChange3.text = "How do you politely refuse?";
        button1.text = "Sorry, I won't be able to attend your celbration."
        button2.text = "I have something to take care of."
        button3.text = "Sure, I will come to your celebration."
        button4.text = "I will be able to attend."
    }

    fun germanText(){
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
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
        val textChange1 = findViewById<TextView>(R.id.ReadingLesson)
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