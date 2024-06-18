package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LearningLanguage : AppCompatActivity() {

    var learningLang: Char = 'G'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.learning_language)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun englishLanguage(view: View?){
        learningLang = 'E'
    }

    fun germanLanguage(view: View?){
        learningLang = 'G'
    }

    fun portugueseLanguage(view: View?){
        learningLang = 'P'
    }

    fun appLanguage(view: View?){
        val intent = Intent(this, AppLanguage::class.java)
        startActivity(intent)
    }

    fun continueButton(view: View?){
        val intent = Intent(this, LanguageLevel::class.java)
        startActivity(intent)
    }

}