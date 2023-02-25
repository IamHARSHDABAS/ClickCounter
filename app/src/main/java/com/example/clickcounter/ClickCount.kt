package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ClickCount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_count)
        var count = 0
        val textNumberOfClicks = findViewById<TextView>(R.id.textNumberOfClicks)
        val textTime = findViewById<TextView>(R.id.textTime)
        val buttonClick = findViewById<Button>(R.id.buttonClick)
        val timeStart = System.currentTimeMillis()
        val clickValue = intent.getStringExtra("EXTRA_CLICK_VALUE") // TODO THIS GIVES NULL VALUE
        buttonClick.setOnClickListener {
            count++
            textNumberOfClicks.text = "$count"
            if (count > 9) {
                textTime.text = "${(System.currentTimeMillis() - timeStart) / 1000}"
                buttonClick.isEnabled = false
            }
        }
    }
}