package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addreview)


        val ratingCancelbtn : Button = findViewById(R.id.button26)
        ratingCancelbtn.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java)
            startActivity(intent)
        }
    }
}