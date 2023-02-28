package com.iamharshdabas.clickcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start = findViewById<Button>(R.id.Start)
        start.setOnClickListener {
            val intent = Intent(this, Clicks::class.java)
            startActivity(intent)
        }
    }
}