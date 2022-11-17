package com.example.charityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var don=findViewById<Button>(R.id.button4)
        var reg=findViewById<Button>(R.id.button3)

        don.setOnClickListener(){
            val intent= Intent(applicationContext, DonateActivity::class.java)
            startActivity(intent)
        }
        reg.setOnClickListener(){
            val intent= Intent(applicationContext, RegCharActivity::class.java)
            startActivity(intent)
        }

    }
}