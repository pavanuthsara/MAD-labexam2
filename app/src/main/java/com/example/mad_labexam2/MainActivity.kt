package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dashboardButton: Button = findViewById(R.id.btnDashboard)

        dashboardButton.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

    }
}