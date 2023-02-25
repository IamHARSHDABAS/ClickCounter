package com.example.clickcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextClickValue = findViewById<EditText>(R.id.editTextClickValue)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener {
            val clickValue = editTextClickValue.text.toString().toInt()
            val intent = Intent(this, ClickCount::class.java)
            intent.putExtra("EXTRA_CLICK_VALUE", clickValue)
            startActivity(intent)
        }
    }
}