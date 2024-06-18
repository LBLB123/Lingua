package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AppLanguage : AppCompatActivity() {

    private var appLang: Char = 'E'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.app_langauge)
    }

    fun getAppLang(): Char {
        return appLang
    }

    fun englishLanguage(view: View?) {
        appLang = 'E'

        println("Language set to English")
    }

    fun germanLanguage(view: View?) {
        appLang = 'G'

        println("Language set to German")
    }

    fun portugueseLanguage(view: View?) {
        appLang = 'P'

        println("Language set to Portuguese")
    }

    fun continueButton(view: View?) {
        val intent = Intent(this, LearningLanguage::class.java)
        intent.putExtra("APP_LANG", appLang)
        startActivity(intent)
    }
}