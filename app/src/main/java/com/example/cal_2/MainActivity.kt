package com.example.cal_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cal_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        setEvent()
    }

    fun setEvent(){

        activityMainBinding.apply {

            buttonPlus.setOnClickListener {

                val number1 = editTextNumber1.text.toString().toInt()
                val number2 = editTextNumber2.text.toString().toInt()

                val result = number1 + number2

                textViewResult.text = " 결과 : $result"
            }

            buttonMinus.setOnClickListener {

                val number1 = editTextNumber1.text.toString().toInt()
                val number2 = editTextNumber2.text.toString().toInt()

                val result = number1 -  number2

                textViewResult.text = " 결과 : $result"
            }

            buttonMultiply.setOnClickListener {

                val number1 = editTextNumber1.text.toString().toInt()
                val number2 = editTextNumber2.text.toString().toInt()

                val result = number1 * number2

                textViewResult.text = " 결과 : $result"
            }

            buttonDivide.setOnClickListener {

                val number1 = editTextNumber1.text.toString().toInt()
                val number2 = editTextNumber2.text.toString().toInt()

                val result = number1 / number2

                textViewResult.text = " 결과 : $result"
            }

        }
    }
}