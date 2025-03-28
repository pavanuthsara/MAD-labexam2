package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ReviewSuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviewsuccess)


        val backtoBookingsbtn : Button = findViewById(R.id.button27)
        backtoBookingsbtn.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java)
            startActivity(intent)
        }
    }
}