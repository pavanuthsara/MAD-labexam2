package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PsychologistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psychologists)

        val doctor1bookbtn: Button = findViewById(R.id.doctor1_book_btn)
        doctor1bookbtn.setOnClickListener{
            val intent = Intent(this, BookPsychologistActivity::class.java)
            startActivity(intent)
        }

        val navBarBookingsbtn : Button = findViewById(R.id.button9)
        navBarBookingsbtn.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java)
            startActivity(intent)
        }

        val navBarProfilebtn : Button = findViewById(R.id.button8)
        navBarProfilebtn.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}