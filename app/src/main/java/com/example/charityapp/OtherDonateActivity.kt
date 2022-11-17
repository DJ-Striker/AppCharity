package com.example.charityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OtherDonateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_donate)
    }
}