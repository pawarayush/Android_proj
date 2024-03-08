package com.example.emplicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonhome = findViewById<Button>(R.id.btnh)

        buttonhome.setOnClickListener(){
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)


        }
    }
}