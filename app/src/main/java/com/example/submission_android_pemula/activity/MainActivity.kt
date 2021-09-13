package com.example.submission_android_pemula.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submission_android_pemula.R
import com.example.submission_android_pemula.adapter.KeyboardAdapter
import com.example.submission_android_pemula.data.Keyboard
import com.example.submission_android_pemula.model.KeyboardData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKeyboard: RecyclerView
    private var list: ArrayList<Keyboard> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout: View = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener{
            intent = Intent(this@MainActivity,About::class.java)
            startActivity(intent)
        }


        rvKeyboard = findViewById(R.id.rv_keyboard)
        rvKeyboard.setHasFixedSize(true)

        list.addAll(KeyboardData.listData)
        showRecycleView()
    }


    private fun showRecycleView(){
        rvKeyboard.layoutManager = LinearLayoutManager(this)
        val listKeyboardAdapter = KeyboardAdapter(list)
        rvKeyboard.adapter = listKeyboardAdapter
    }


}