package com.iamharshdabas.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        var time = false
        val textNumberOfClicks = findViewById<TextView>(R.id.textNumberOfClicks)
        val buttonClick = findViewById<Button>(R.id.buttonClick)
        buttonClick.setOnClickListener {
            count++
            time = true
            textNumberOfClicks.text = "$count"
        }
    }
}