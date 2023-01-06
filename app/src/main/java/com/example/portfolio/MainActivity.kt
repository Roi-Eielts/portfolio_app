package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private = alleen deze class. lateinit is voor value komt pas bij properties. var is variable
    private lateinit var binding: ActivityMainBinding


    //fun is function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        replaceFragement(Home())
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {

                R.id.Home -> replaceFragement(Home())
                R.id.About_me -> replaceFragement(About_me())
                R.id.Projects -> replaceFragement(Projects())
                R.id.Contact -> replaceFragement(Contact())

                else -> {

                }
            }
            true
        }

    }

    private fun replaceFragement(fragment : Fragment) {
        //val is constant variable
        val fragmentManager = supportFragmentManager
        val fragementTransaction = fragmentManager.beginTransaction()
        fragementTransaction.replace(R.id.frameLayout, fragment)
        fragementTransaction.commit()
    }
}