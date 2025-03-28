package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val navBarPsycholigstsbtn : Button = findViewById(R.id.button17)
        navBarPsycholigstsbtn.setOnClickListener{
            val intent = Intent(this, PsychologistActivity::class.java)
            startActivity(intent)
        }

        val navBarBookingsbtn : Button = findViewById(R.id.button16)
        navBarBookingsbtn.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java)
            startActivity(intent)
        }

        val logOutBtn : Button = findViewById(R.id.button15)
        logOutBtn.setOnClickListener{
            val intent = Intent(this, SignInAcitivity::class.java)
            startActivity(intent)
        }

        val editProfilebtn : Button = findViewById(R.id.button14)
        editProfilebtn.setOnClickListener{
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }

}