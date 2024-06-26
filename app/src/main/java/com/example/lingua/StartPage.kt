package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lingua.ui.settings.SettingsFragment

class StartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.startpage)
        langaugeChoice();
    }

    private val class1 = AppLanguage()

    fun langaugeChoice(){
        when(class1.getAppLang()){
            'E' -> englishText()
            'G' -> germanText()
            'P' -> portugueseText()
        }
    }

    fun englishText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = "Continue"
    }

    fun germanText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = "Weiter"
    }

    fun portugueseText(){
        val button = findViewById<View>(R.id.Continue) as Button
        button.text = "Continuar"
    }

    fun settings(view: View?){
        val intent = Intent(this, SettingsFragment::class.java)
        startActivity(intent)
    }

    fun continueButton(view: View?){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}