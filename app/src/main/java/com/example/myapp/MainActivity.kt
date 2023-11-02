package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val angkaBulat: Int? = null
    val angkaDesimal: Double = 14.3
    val angkaPanjang: Long = 90000000000000000L

    val karakter: Char = 'A'
    val kata: String = "aku belajar kotlin hari ini"

    var benar: Boolean = true
    val salah: Boolean = false

    val angkaArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val stringArray: Array<String> = arrayOf("satu", "dua", "tiga", "empat", "lima")
    val booleanArray: Array<Boolean> = arrayOf(true, false, true, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (angkaBulat == 4) {
            benar = true
        }
    }
}