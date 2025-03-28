package com.example.mad_labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpbtn : Button = findViewById(R.id.button21)
        signUpbtn.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        val signInbtn : Button = findViewById(R.id.button22)
        signInbtn.setOnClickListener{
            val intent = Intent(this, SignInAcitivity::class.java)
            startActivity(intent)
        }


    }
}