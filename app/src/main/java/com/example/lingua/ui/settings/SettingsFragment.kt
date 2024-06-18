package com.example.lingua.ui.settings

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lingua.AppLanguage
import com.example.lingua.LanguageLevel
import com.example.lingua.R
import com.example.lingua.StartPage

class SettingsFragment : Fragment() {

    private val class1 = AppLanguage()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        languageChoice(view)
        return view
    }

    private fun languageChoice(view: View){
        when(class1.appLang){
            'E' -> englishText(view)
            'G' -> germanText(view)
            'P' -> portugueseText(view)
        }
    }

    private fun englishText(view: View){
        val textChange = view.findViewById<TextView>(R.id.Text1)
        val button1 = view.findViewById<Button>(R.id.Accessability)
        val button2 = view.findViewById<Button>(R.id.Language)
        val button3 = view.findViewById<Button>(R.id.LanguageLevel)
        val button4 = view.findViewById<Button>(R.id.Help)
        val button5 = view.findViewById<Button>(R.id.Logout)
        textChange.text = "Settings"
        button1.text = "Accessability"
        button2.text = "Language"
        button3.text = "LanguageLevel"
        button4.text = "Help"
        button5.text = "Logout"
    }

    private fun germanText(view: View){
        val textChange = view.findViewById<TextView>(R.id.Text1)
        val button1 = view.findViewById<Button>(R.id.Accessability)
        val button2 = view.findViewById<Button>(R.id.Language)
        val button3 = view.findViewById<Button>(R.id.LanguageLevel)
        val button4 = view.findViewById<Button>(R.id.Help)
        val button5 = view.findViewById<Button>(R.id.Logout)
        textChange.text = "Einstellungen"
        button1.text = "Barrierefreiheit"
        button2.text = "Sprache"
        button3.text = "Sprachniveau"
        button4.text = "Hilfe"
        button5.text = "Abmelden"
    }

    private fun portugueseText(view: View){
        val textChange = view.findViewById<TextView>(R.id.Text1)
        val button1 = view.findViewById<Button>(R.id.Accessability)
        val button2 = view.findViewById<Button>(R.id.Language)
        val button3 = view.findViewById<Button>(R.id.LanguageLevel)
        val button4 = view.findViewById<Button>(R.id.Help)
        val button5 = view.findViewById<Button>(R.id.Logout)
        textChange.text = "Configurações"
        button1.text = "Acessibilidade"
        button2.text = "Idioma"
        button3.text = "Nível de Idioma"
        button4.text = "Ajuda"
        button5.text = "Sair"
    }

    fun back(view: View){
        val intent = Intent(activity, StartPage::class.java)
        startActivity(intent)
    }

    fun LanguageSelection(view: View){
        val intent = Intent(activity, AppLanguage::class.java)
        startActivity(intent)
    }

    fun LanguageLevelSelection(view: View){
        val intent = Intent(activity, LanguageLevel::class.java)
        startActivity(intent)
    }
}