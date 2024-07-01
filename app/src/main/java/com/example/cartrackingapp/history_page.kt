package com.example.cartrackingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class history_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_page)
        val NewMain:Button = findViewById(R.id.new_main_btn)



        NewMain.setOnClickListener{
            val NMIntent = Intent(this, MainActivity::class.java)
            startActivity(NMIntent)
        }
    }
}