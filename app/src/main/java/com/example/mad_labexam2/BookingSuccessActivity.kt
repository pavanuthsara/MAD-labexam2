package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookingSuccessActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookingsuccess)

        val successBacktoBookings : Button = findViewById(R.id.button13)
        successBacktoBookings.setOnClickListener{
            val intent = Intent(this, UserBookingsActivity::class.java )
            startActivity(intent)
        }
    }
}