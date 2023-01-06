package com.example.portfolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val nextbtn : Button = view.findViewById(R.id.send)
        val nextbtn2 : Button = view.findViewById(R.id.About_mebtn)
        nextbtn.setOnClickListener {
            R.id.Projects
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout, Projects())
            if (transaction != null) {
                transaction.commit()
            }

        }
        nextbtn2.setOnClickListener {
            R.id.About_me
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.frameLayout, About_me())
            if (transaction != null) {
                transaction.commit()
            }
        }
        return view
    }



}