package com.example.submission_android_pemula

import com.example.submission_android_pemula.data.Keyboard
import com.example.submission_android_pemula.model.KeyboardData

interface KeyboardListener {
    fun onItemClick(keyboard: Keyboard)
}