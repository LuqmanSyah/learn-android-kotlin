package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var angkaBulat: Int = 1
    var angkaDesimal: Double = 14.3
    val angkaPanjang: Long = 90000000000000000L

    val karakter: Char = 'A'
    var kata: String = "aku belajar kotlin hari ini"

    var benar: Boolean = true
    val salah: Boolean = false

    val angkaArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val stringArray: Array<String> = arrayOf("satu", "dua", "tiga", "empat", "lima")
    val booleanArray: Array<Boolean> = arrayOf(true, false, true, false)

    fun hitung(angka1: Int, angka2: Int)
    {
        val jumlah = angka1 + angka2
    }

    fun increment()
    {
        angkaBulat++
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (angkaBulat == 4 && angkaDesimal > 13) {
//            benar = true
//            kata = "Berhasil mengubah kata"
//        } else {
//            benar = false
//        }
//
//        hitung(1, 2)
//
//        increment()

        val textView: TextView = findViewById(R.id.text_view)
        val btnHitung: Button = findViewById(R.id.btn_hitung)
    }
}