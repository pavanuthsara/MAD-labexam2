package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val checkButton1 : ImageView = findViewById(R.id.imageView1)
        checkButton1.setOnClickListener{
            val intent = Intent(this, CheckActivity::class.java)
            startActivity(intent)
        }
    }
}