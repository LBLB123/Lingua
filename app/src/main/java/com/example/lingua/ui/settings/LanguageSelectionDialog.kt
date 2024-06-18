package com.example.lingua.ui.settings

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
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
        setContentView(R.layout.dialog_language_selection)

        val languageOptionsContainer = findViewById<LinearLayout>(R.id.language_options_container)

        for ((index, language) in languages.withIndex()) {
            val itemView = layoutInflater.inflate(R.layout.item_language_option, languageOptionsContainer, false)
            val optionTextView = itemView.findViewById<TextView>(R.id.language_option_text)
            val optionFlagView = itemView.findViewById<ImageView>(R.id.language_option_flag)
            optionTextView.text = language
            optionFlagView.setImageResource(flags[index])

            itemView.setOnClickListener {
                onLanguageSelected(language, flags[index])
                dismiss()
            }

            languageOptionsContainer.addView(itemView)
        }
    }
}
