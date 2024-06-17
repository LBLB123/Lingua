package com.example.lingua.ui.settings

import android.annotation.SuppressLint
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

    private var currentLearningLanguage = languages[0]
    private var currentLearningFlag = flags[0]

    private var currentAppLanguage = languages[0]
    private var currentAppFlag = flags[0]

    private lateinit var learningLanguageTextView: TextView
    private lateinit var learningLanguageFlagView: ImageView
    private lateinit var appLanguageTextView: TextView
    private lateinit var appLanguageFlagView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_languages, container, false)

        learningLanguageTextView = view.findViewById(R.id.learning_language_text)
        learningLanguageFlagView = view.findViewById(R.id.learning_language_flag)
        appLanguageTextView = view.findViewById(R.id.app_language_text)
        appLanguageFlagView = view.findViewById(R.id.app_language_flag)

        val appLanguageContainer = view.findViewById<LinearLayout>(R.id.app_language_container)
        val saveButton = view.findViewById<Button>(R.id.save_button)

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
            findNavController().popBackStack()
        }

        return view
    }

    @SuppressLint("MissingInflatedId")
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
}
