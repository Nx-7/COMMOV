package com.example.ficha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {

            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}