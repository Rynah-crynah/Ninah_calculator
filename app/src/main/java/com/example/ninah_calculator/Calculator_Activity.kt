package com.example.ninah_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Calculator_Activity : AppCompatActivity() {
    lateinit var btnModulus: Button
    lateinit var tvResults: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnDivide: Button
    lateinit var tilFirstNumber:TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var  etFirstNumber: TextInputEditText
    lateinit var  etSecondNumber: TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)
        tvResults = findViewById(R.id.tvResult)


        tilFirstNumber.setOnClickListener {
            tvResults.text = ""
            val fisrtNumber = etFirstNumber.text.toString()
            if (fisrtNumber.isBlank()) {
                tilFirstNumber.setError("First Number is required")
                return@setOnClickListener
            }
        }
        tilSecondNumber.setOnClickListener {
            tvResults.text = ""
            val secondNumber = etSecondNumber.text.toString()
            if (secondNumber.isBlank()) {
                tilSecondNumber.setError("First Number is required")
                return@setOnClickListener
            }

        }
        btnAdd.setOnClickListener {
            tvResults.text = ""
            val numberOne = etSecondNumber.text.toString()
            val numberTwo = etSecondNumber.text.toString()
            if (numberOne.isBlank()) {
                tilFirstNumber.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                tilSecondNumber.setError("Second number is required")
                return@setOnClickListener
            }
            addition(numberOne.toInt(), numberTwo.toInt())
        }
        btnSubtract.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNumber.text.toString()
            val numberTwo = etSecondNumber.text.toString()
            if (numberOne.isBlank()) {
                tilFirstNumber.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                tilSecondNumber.setError("Second number is required")
                return@setOnClickListener
            }
            subtraction(numberOne.toInt(), numberTwo.toInt())
        }

        btnDivide.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNumber.text.toString()
            val numberTwo = etSecondNumber.text.toString()
            if (numberOne.isBlank()) {
                tilFirstNumber.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                tilSecondNumber.setError("Second number is required")
                return@setOnClickListener
            }
            division(numberOne.toInt(), numberTwo.toInt())

        }
        btnModulus.setOnClickListener {
            tvResults.text = ""
            val numberOne = etFirstNumber.text.toString()
            val numberTwo = etSecondNumber.text.toString()
            if (numberOne.isBlank()) {
                tilFirstNumber.setError("First Number is required")
                return@setOnClickListener
            }
            if (numberTwo.isBlank()) {
                tilSecondNumber.setError("Second number is required")
                return@setOnClickListener
            }
            modulus(numberOne.toInt(), numberTwo.toInt())

        }
    }

    fun addition(firstNumber: Int, secondNumber: Int) {
        var add = firstNumber + secondNumber
        tvResults.text = add.toString()
    }

    fun subtraction(firstNumber: Int, secondNumber: Int) {
        var subtract = firstNumber - secondNumber
        tvResults.text = subtract.toString()
    }

    fun division(firstNumber: Int, secondNumber: Int) {
        var divide = firstNumber / secondNumber
        tvResults.text = divide.toString()
    }

    fun modulus(firstNumber: Int, secondNumber: Int) {
        var mod = firstNumber % secondNumber
        tvResults.text = mod.toString()
    }
}
