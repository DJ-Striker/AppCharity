package com.example.charityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
