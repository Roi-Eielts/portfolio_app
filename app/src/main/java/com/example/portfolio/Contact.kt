package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Contact : Fragment() {
    private lateinit var verstuuren : Button
    private lateinit var emailet : EditText
    private lateinit var naamet : EditText
    private lateinit var berichtet : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)
        verstuuren = view.findViewById(R.id.verstuur)
        naamet = view.findViewById(R.id.Naam)
        emailet = view.findViewById(R.id.Email)
        berichtet = view.findViewById(R.id.bericht)



        verstuuren.setOnClickListener {
            val naam = naamet.getText().toString()
            val email = emailet.getText().toString()
            val bericht = berichtet.getText().toString()

            val emailbody = bericht

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("roieielts@gmail.com"))
            intent.putExtra(Intent.EXTRA_TEXT, emailbody)

            intent.type = "message/rfc822"

            startActivity(Intent.createChooser(intent, "Choose an Email client :"))

        }
        return view
    }

}