package com.example.charityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DonateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate)

        var fd=findViewById<Button>(R.id.button2)
        var kd=findViewById<Button>(R.id.button5)

        fd.setOnClickListener(){
            val intent= Intent(applicationContext,FoodDonateActivity::class.java)
            startActivity(intent)
        }
        kd.setOnClickListener(){
            val intent= Intent(applicationContext,OtherDonateActivity::class.java)
            startActivity(intent)
        }


    }

}