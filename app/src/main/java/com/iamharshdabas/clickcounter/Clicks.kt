package com.iamharshdabas.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Clicks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicks)
        var count = 0
        val textNumberOfClicks = findViewById<TextView>(R.id.textNumberOfClicks)
        val textTime = findViewById<TextView>(R.id.textTime)
        val buttonClick = findViewById<Button>(R.id.buttonClick)
        val timeStart = System.currentTimeMillis()
        buttonClick.setOnClickListener {
            count++
            textNumberOfClicks.text = "$count"
            textTime.text = "${System.currentTimeMillis() - timeStart}"
            if (count == 69) {
                buttonClick.isEnabled = false
            }
        }
    }
}