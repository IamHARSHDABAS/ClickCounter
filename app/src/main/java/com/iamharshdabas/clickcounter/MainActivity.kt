package com.iamharshdabas.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        val textNumberOfClicks = findViewById<TextView>(R.id.textNumberOfClicks)
        val textTime = findViewById<TextView>(R.id.textTime)
        val buttonClick = findViewById<Button>(R.id.buttonClick)
        val timeStart = System.currentTimeMillis()
        buttonClick.setOnClickListener {
            count++
            textNumberOfClicks.text = "$count"
            if (count > 9) {
                textTime.text = "${System.currentTimeMillis() - timeStart}"
                buttonClick.isEnabled = false
            }
        }
    }
}