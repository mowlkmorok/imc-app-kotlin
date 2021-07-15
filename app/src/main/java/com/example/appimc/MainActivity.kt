package com.example.appimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appmmc.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Exit button
        btExit.setOnClickListener {
            exitProcess(0)
        }

        // Clear button
        btClear.setOnClickListener {
            // Cleaning
            txtResult.text = "0"
            txtHeight.setText("")
            txtWeight.setText("")

        }


        // Calculate button
        btCalculate.setOnClickListener {
            // To Get the values let's use it
            val weight = txtWeight.text.toString().toFloat()
            val height = txtHeight.text.toString().toFloat()
            // Principal calc
            val result = weight / (height * height)
            txtResult.text = result.toString()

        }


    }
}