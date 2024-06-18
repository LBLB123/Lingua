package com.example.lingua.ui.settings

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lingua.R

class LanguageLevelFragment : Fragment() {
    private val levels = arrayOf("A1", "A2", "B1", "B2")
    private val descriptions = arrayOf("Beginner", "Elementary", "Intermediate", "Advanced")
    private var selectedIndex = -1
    private lateinit var sharedPreferences: android.content.SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.activity_language_level, container, false)
        sharedPreferences = requireContext().getSharedPreferences("languageLevelPrefs", Context.MODE_PRIVATE)

        val levelsContainer = rootView.findViewById<LinearLayout>(R.id.language_levels_container)

        selectedIndex = sharedPreferences.getInt("selectedLevelIndex", -1)

        for (i in levels.indices) {
            val itemView = inflater.inflate(
                R.layout.item_language_level,
                levelsContainer,
                false
            )

            val levelTextView = itemView.findViewById<TextView>(R.id.level_text)
            levelTextView.text = levels[i]

            val descriptionTextView = itemView.findViewById<TextView>(R.id.description_text)
            descriptionTextView.text = descriptions[i]

            val radioButton = itemView.findViewById<RadioButton>(R.id.radio_button)
            radioButton.isChecked = i == selectedIndex
            radioButton.setOnClickListener {
                selectedIndex = i
                updateRadioButtons(levelsContainer)
                saveSelectedIndex()
            }

            levelsContainer.addView(itemView)
        }

        val saveButton = rootView.findViewById<Button>(R.id.save_button)
        saveButton.setOnClickListener {
            findNavController().popBackStack()
        }

        return rootView
    }

    private fun updateRadioButtons(container: LinearLayout) {
        for (i in 0 until container.childCount) {
            val itemView = container.getChildAt(i)
            val radioButton = itemView.findViewById<RadioButton>(R.id.radio_button)
            radioButton.isChecked = i == selectedIndex
        }
    }

    private fun saveSelectedIndex() {
        sharedPreferences.edit().putInt("selectedLevelIndex", selectedIndex).apply()
    }
}
