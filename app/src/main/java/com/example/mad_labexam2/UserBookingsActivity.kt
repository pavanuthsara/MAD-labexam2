package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserBookingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userbookings)

        val navBarPsycholigstsbtn : Button = findViewById(R.id.button10)
        navBarPsycholigstsbtn.setOnClickListener{
            val intent = Intent(this, PsychologistActivity::class.java)
            startActivity(intent)
        }

        val navBarProfilebtn : Button = findViewById(R.id.button11)
        navBarProfilebtn.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val addReviewBtn : Button = findViewById(R.id.button2)
        addReviewBtn.setOnClickListener{
            val intent = Intent(this, AddReviewActivity::class.java)
            startActivity(intent)
        }

    }
}