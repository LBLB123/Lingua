package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.settings)
        langaugeChoice();
    }

    private val class1 = AppLanguage()

    fun langaugeChoice(){
        when(class1.appLang){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }

    fun englishText(){
        val textChange = findViewById<TextView>(R.id.Text1)
        val button1 = findViewById<View>(R.id.Accessability) as Button
        val button2 = findViewById<View>(R.id.Language) as Button
        val button3 = findViewById<View>(R.id.LanguageLevel) as Button
        val button4 = findViewById<View>(R.id.Help) as Button
        val button5 = findViewById<View>(R.id.Logout) as Button
        textChange.text = "Settings";
        button1.text = "Accessability"
        button2.text = "Language"
        button3.text = "LanguageLevel"
        button4.text = "Help"
        button5.text = "Logout"
    }

    fun germanText(){
        val textChange = findViewById<TextView>(R.id.Text1)
        val button1 = findViewById<View>(R.id.Accessability) as Button
        val button2 = findViewById<View>(R.id.Language) as Button
        val button3 = findViewById<View>(R.id.LanguageLevel) as Button
        val button4 = findViewById<View>(R.id.Help) as Button
        val button5 = findViewById<View>(R.id.Logout) as Button
        textChange.text = "Einstellungen"
        button1.text = "Barrierefreiheit"
        button2.text = "Sprache"
        button3.text = "Sprachniveau"
        button4.text = "Hilfe"
        button5.text = "Abmelden"
    }

    fun portugueseText(){
        val textChange = findViewById<TextView>(R.id.Text1)
        val button1 = findViewById<View>(R.id.Accessability) as Button
        val button2 = findViewById<View>(R.id.Language) as Button
        val button3 = findViewById<View>(R.id.LanguageLevel) as Button
        val button4 = findViewById<View>(R.id.Help) as Button
        val button5 = findViewById<View>(R.id.Logout) as Button
        textChange.text = ""
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
    }

    fun back(view: View?){
        val intent = Intent(this, StartPage::class.java)
        startActivity(intent)
    }

    fun LanguageSelection(view: View?){
        val intent = Intent(this, AppLanguage::class.java)
        startActivity(intent)
    }

    fun LanguageLevelSelection(view: View?){
        val intent = Intent(this, LanguageLevel::class.java)
        startActivity(intent)
    }

}