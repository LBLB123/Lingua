package com.example.lingua.ui.settings

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.lingua.R

class LanguageSelectionDialog(
    context: Context,
    private val onLanguageSelected: (String, Int) -> Unit
) : Dialog(context) {

    private val languages = listOf("English", "German", "Portuguese")
    private val flags = listOf(R.drawable.gb_flag, R.drawable.german, R.drawable.portuguese)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_language_option)

        val languageContainer = findViewById<LinearLayout>(R.id.app_language_container)

        languages.forEachIndexed { index, language ->
            val itemView = layoutInflater.inflate(R.layout.item_language_option, languageContainer, false)
            val languageTextView = itemView.findViewById<TextView>(R.id.language_option_text)
            val languageFlagView = itemView.findViewById<ImageView>(R.id.language_option_flag)
            languageTextView.text = language
            languageFlagView.setImageDrawable(ContextCompat.getDrawable(context, flags[index]))

            itemView.setOnClickListener {
                onLanguageSelected(language, flags[index])
                dismiss()
            }

            languageContainer.addView(itemView)
        }
    }
}
