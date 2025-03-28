package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val findpsychologistsbtn : ImageView = findViewById(R.id.findPsychologists)
        findpsychologistsbtn.setOnClickListener{
            val intent = Intent(this, PsychologistActivity::class.java)
            startActivity(intent)
        }

        val mybookingsbtn : ImageView = findViewById(R.id.myBookings)
        mybookingsbtn.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java)
            startActivity(intent)
        }

        val myprofilebtn : ImageView = findViewById(R.id.myProfile)
        myprofilebtn.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }


    }
}