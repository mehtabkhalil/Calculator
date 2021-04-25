package com.example.calculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.add.setOnClickListener {
            addResult(it)
        }
        binding.minus.setOnClickListener {
            minusResult(it)
        }
        binding.divide.setOnClickListener {
            divideResult(it)
        }
        binding.times.setOnClickListener {
            timesResult(it)
        }
    }

    private fun addResult(view: View) {

        binding.apply {
            result.text = "Result = "+(num1.text.toString().trim().toFloat() + num2.text.toString().trim().toFloat() ) .toString()
            result.visibility = View.VISIBLE
        }

    // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun minusResult(view: View) {

        binding.apply {
            result.text = "Result = "+(num1.text.toString().trim().toFloat() - num2.text.toString().trim().toFloat() ) .toString()
            result.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun divideResult(view: View) {

        binding.apply {
            result.text = "Result = "+(num1.text.toString().trim().toFloat() / num2.text.toString().trim().toFloat() ) .toString()
            result.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun timesResult(view: View) {

        binding.apply {
            result.text = "Result = "+(num1.text.toString().trim().toFloat() * num2.text.toString().trim().toFloat() ) .toString()
            result.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}