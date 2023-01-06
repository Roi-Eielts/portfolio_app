package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Projects : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_projects, container, false)
        val portfolio_app : Button = view.findViewById(R.id.portfolio_app)
        val pokemon_game : Button = view.findViewById(R.id.pokemon_game)
        val rekenmachine : Button = view.findViewById(R.id.Rekenmachine)

        portfolio_app.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Roi-Eielts/portfolio_app"))
            startActivity(i)
        }
        pokemon_game.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Roi-Eielts/Pokemon-Game"))
            startActivity(i)
        }
        rekenmachine.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Roi-Eielts/Web-rekenmachine"))
            startActivity(i)
        }
        return view
    }

}