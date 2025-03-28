package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookPsychologistActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookpsychologist)

        val cancelBtn : Button = findViewById(R.id.button3)
        cancelBtn.setOnClickListener{
            val intent = Intent(this, PsychologistActivity::class.java )
            startActivity(intent)
        }
    }
}