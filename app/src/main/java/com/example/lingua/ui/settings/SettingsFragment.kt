package com.example.lingua.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lingua.R

class SettingsFragment : Fragment() {

    private val settings = listOf("Accessibility", "Languages", "Language Level", "Help", "Logout")
    private val icons = listOf(R.drawable.accessibility, R.drawable.languages, R.drawable.language_level, R.drawable.help, R.drawable.logout)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        val settingsContainer: LinearLayout = view.findViewById(R.id.settings_container)

        settings.forEachIndexed { index, text ->
            val itemView = layoutInflater.inflate(R.layout.item_settings, settingsContainer, false)

            val iconView = itemView.findViewById<ImageView>(R.id.icon)
            iconView.setImageResource(icons[index])
            iconView.setColorFilter(
                ContextCompat.getColor(requireContext(), if (index == 4) R.color.red else R.color.white),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            val textView = itemView.findViewById<TextView>(R.id.text)
            textView.text = text
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))

            val arrowView = itemView.findViewById<ImageView>(R.id.arrow)
            arrowView.setOnClickListener {
                navigateToDestination(index)
            }

            settingsContainer.addView(itemView)
        }

        return view
    }

    private fun navigateToDestination(index: Int) {
        when (index) {
            1 -> {
                findNavController().navigate(R.id.navigation_languages)
            }
            2 -> { findNavController().navigate(R.id.navigation_language_level)
            }
        }
    }
}
