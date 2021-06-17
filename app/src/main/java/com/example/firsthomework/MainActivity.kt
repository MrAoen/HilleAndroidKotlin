package com.example.firsthomework

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.mainButton)
        val label = findViewById<TextView>(R.id.txtLabel1)

        btn.setOnClickListener {
            label.text = "Hello my homework!"
            label.setTextColor(Color.BLUE)
        }

    }



}