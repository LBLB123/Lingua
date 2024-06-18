package com.example.lingua

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AppLanguage : AppCompatActivity() {

    private var appLang : Char = 'E'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.app_langauge)
    }

    fun getAppLang(): Char{
        return appLang
    }

    fun englishLanguage(view: View?){
        appLang = 'E'
    }

    fun germanLanguage(view: View?){
        appLang = 'G'
    }

    fun portugueseLanguage(view: View?){
        appLang = 'P'
    }

    fun continueButton(view: View?){
        val intent = Intent(this, LearningLanguage::class.java)
        startActivity(intent)
    }

}