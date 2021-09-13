package com.example.submission_android_pemula.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.example.submission_android_pemula.R

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener{
            onBackPressed()
        }
    }
}