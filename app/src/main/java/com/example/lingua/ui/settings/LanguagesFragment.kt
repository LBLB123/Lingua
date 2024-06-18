package com.example.lingua.ui.settings

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lingua.R

class LanguagesFragment : Fragment() {

    private val languages = listOf("English", "German", "Portuguese")
    private val flags = listOf(R.drawable.gb_flag, R.drawable.german, R.drawable.portuguese)

    private lateinit var sharedPreferences: android.content.SharedPreferences

    private var currentLearningLanguage = "English"
    private var currentLearningFlag = R.drawable.gb_flag

    private var currentAppLanguage = "English"
    private var currentAppFlag = R.drawable.gb_flag

    private lateinit var learningLanguageTextView: TextView
    private lateinit var learningLanguageFlagView: ImageView
    private lateinit var appLanguageTextView: TextView
    private lateinit var appLanguageFlagView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_languages, container, false)
        sharedPreferences = requireContext().getSharedPreferences("languagePrefs", Context.MODE_PRIVATE)

        learningLanguageTextView = view.findViewById(R.id.learning_language_text)
        learningLanguageFlagView = view.findViewById(R.id.learning_language_flag)
        appLanguageTextView = view.findViewById(R.id.app_language_text)
        appLanguageFlagView = view.findViewById(R.id.app_language_flag)

        val appLanguageContainer = view.findViewById<LinearLayout>(R.id.app_language_container)
        val saveButton = view.findViewById<Button>(R.id.save_button)

        currentLearningLanguage = sharedPreferences.getString("learningLanguage", "English") ?: "English"
        currentAppLanguage = sharedPreferences.getString("appLanguage", "English") ?: "English"
        currentLearningFlag = getFlagResourceId(currentLearningLanguage)
        currentAppFlag = getFlagResourceId(currentAppLanguage)

        learningLanguageTextView.text = currentLearningLanguage
        learningLanguageFlagView.setImageResource(currentLearningFlag)
        appLanguageTextView.text = currentAppLanguage
        appLanguageFlagView.setImageResource(currentAppFlag)

        appLanguageContainer.setOnClickListener {
            LanguageSelectionDialog(requireActivity()) { newLanguage, newFlag ->
                currentAppLanguage = newLanguage
                currentAppFlag = newFlag
                appLanguageTextView.text = newLanguage
                appLanguageFlagView.setImageResource(newFlag)
            }.show()
        }

        saveButton.setOnClickListener {
            saveSelectedLanguages()
            findNavController().popBackStack()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val learningOptionsContainer = view.findViewById<LinearLayout>(R.id.learning_options_container)
        for ((index, language) in languages.withIndex()) {
            val itemView = layoutInflater.inflate(R.layout.item_language_option, learningOptionsContainer, false)
            val optionTextView = itemView.findViewById<TextView>(R.id.language_option_text)
            val optionFlagView = itemView.findViewById<ImageView>(R.id.language_option_flag)
            optionTextView.text = language
            optionFlagView.setImageResource(flags[index])

            itemView.setOnClickListener {
                currentLearningLanguage = language
                currentLearningFlag = flags[index]
                learningLanguageTextView.text = language
                learningLanguageFlagView.setImageResource(currentLearningFlag)
            }

            learningOptionsContainer.addView(itemView)
        }
    }

    private fun saveSelectedLanguages() {
        val editor = sharedPreferences.edit()
        editor.putString("learningLanguage", currentLearningLanguage)
        editor.putString("appLanguage", currentAppLanguage)
        editor.apply()
    }

    private fun getFlagResourceId(language: String): Int {
        return when (language) {
            "English" -> R.drawable.gb_flag
            "German" -> R.drawable.german
            "Portuguese" -> R.drawable.portuguese
            else -> R.drawable.gb_flag
        }
    }
}
