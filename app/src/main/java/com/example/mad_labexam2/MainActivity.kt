package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dashboardButton: Button = findViewById(R.id.btnDashboard)
        val psychologistButton: Button = findViewById(R.id.btnPsychologist)

        dashboardButton.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        psychologistButton.setOnClickListener{
            val intent = Intent(this, PsychologistActivity::class.java)
            startActivity(intent)
        }

    }
}