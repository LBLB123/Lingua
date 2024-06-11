package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Language2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.languages2)
    }

    fun back(view: View?){
        val intent = Intent(this, Settings::class.java)
        startActivity(intent)
    }

}