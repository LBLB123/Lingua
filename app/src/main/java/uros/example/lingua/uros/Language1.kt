package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Language1 : AppCompatActivity() {

    var lang: Char = 'G'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.langauges1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun englishLanguage(view: View?){
        lang = 'E'
    }

    fun germanLanguage(view: View?){
        lang = 'G'
    }

    fun portugueseLanguage(view: View?){
        lang = 'P'
    }

    fun continueButton(view: View?){
        val intent = Intent(this, LanguageLevel1::class.java)
        startActivity(intent)
    }

}