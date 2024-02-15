package com.mortatval.seminar_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textTopLine: TextView = findViewById(R.id.songName)
        textTopLine.text = "Наименование композиции"
        val textBottomLine: TextView = findViewById(R.id.singer)
        textBottomLine.text = "Исполнитель"
    }
}