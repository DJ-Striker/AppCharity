package com.example.charityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FoodDonateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_donate)
    }
}