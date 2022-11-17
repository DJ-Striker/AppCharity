package com.example.charityapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.expandablelayout.ExpandableLayout

class RegCharActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charities)


        val ex = findViewById<ExpandableLayout>(R.id.expandable1)
        val ex2 = findViewById<ExpandableLayout>(R.id.expandable2)
        val ex3 = findViewById<ExpandableLayout>(R.id.expandable3)
        val ex4 = findViewById<ExpandableLayout>(R.id.expandable4)

        var g = 0

        ex.parentLayout.setOnClickListener{
            if (g==0) {
                g=1
                ex.expand()
            }else{
                g=0
                ex.collapse()
            }

        ex2.parentLayout.setOnClickListener{
            if (g==0) {
                g=1
                ex2.expand()
            }else{
                g=0
                ex2.collapse()
            }
        }
            ex3.parentLayout.setOnClickListener{
                if (g==0) {
                    g=1
                    ex3.expand()
                }else{
                    g=0
                    ex3.collapse()
                }
            }
            ex4.parentLayout.setOnClickListener{
                if (g==0) {
                    g=1
                    ex4.expand()
                }else{
                    g=0
                    ex4.collapse()
                }
            }

        }



    }
}