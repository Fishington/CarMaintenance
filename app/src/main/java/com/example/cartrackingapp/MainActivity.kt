package com.example.cartrackingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var dbHelper: CarMaintenanceDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val history_btn: Button = findViewById(R.id.history_btn)


        // Initialize the helper class
        dbHelper = CarMaintenanceDBHelper(this)

        // Check if a table needs to be created (optional)
        // You can implement a logic to check if the table exists before creating it
        // dbHelper.writableDatabase // This will create the table if it doesn't exist


        history_btn.setOnClickListener{
            val hbIntent = Intent(this, history_page::class.java)
            startActivity(hbIntent)
        }
    }
}