package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    lateinit var tvCalculator : TextView
    lateinit var etEnterNumber:TextInputEditText
    private lateinit var tilEnterNumber : TextInputLayout
    private lateinit var etSecondNumber:TextInputEditText
    private lateinit var  tilSecondNumber: TextInputLayout
    private lateinit var tvResult : TextView

    private lateinit var button: Button
    private lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        addition()
        subtraction()
        division()
        multiplication()

    }

//    override fun onResume() {
//        super.onResume()
//        button.setOnClickListener {
//            addition()
//        }
//        button2.setOnClickListener {
//            subtraction()
//        }
//        button3.setOnClickListener {
//            multiplication()
//        }
//        button4.setOnClickListener {
//            division()
//        }
//
//    }
   private fun castView(){
        etEnterNumber=findViewById(R.id.etEnterNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
        tvCalculator = findViewById(R.id.tvCalculator)
        tilEnterNumber = findViewById(R.id.tilEnterNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        tvResult = findViewById(R.id.tvResult)

    }
    private fun addition(){
        button.setOnClickListener {
            val enterNumber = etEnterNumber.text.toString().toDouble()
            val secondNumber = etSecondNumber.text.toString().toDouble()
            val result = enterNumber +secondNumber
            tvResult.text = result.toString()
        }

    }
  private  fun subtraction(){
      button2.setOnClickListener {
          val enterNumber = etEnterNumber.text.toString().toDouble()
          val secondNumber = etSecondNumber.text.toString().toDouble()
          val result = enterNumber - secondNumber
          tvResult.text = result.toString()
      }

    }
   private fun multiplication(){
       button3.setOnClickListener {
           val enterNumber = etEnterNumber.text.toString().toDouble()
           val secondNumber = etSecondNumber.text.toString().toDouble()
           val result = enterNumber * secondNumber
           tvResult.text = result.toString()
       }
       }

    private fun division(){
        button4.setOnClickListener {
            val enterNumber = etEnterNumber.text.toString().toDouble()
            val secondNumber = etSecondNumber.text.toString().toDouble()
            val result = enterNumber / secondNumber
            tvResult.text = result.toString()
        }

    }



}