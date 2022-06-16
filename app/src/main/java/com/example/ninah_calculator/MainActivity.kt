package com.example.ninah_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.ninah_calculator.Calculator_Activity


class MainActivity : AppCompatActivity() {
    lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnCalculate = findViewById(R.id.btnCalculate)
       btnCalculate.setOnClickListener {
            val intent = Intent(this,Calculator_Activity::class.java)
            startActivity(intent)
        }
    }
}

