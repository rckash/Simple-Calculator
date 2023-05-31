package com.example.androidpracticeexercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpracticeexercise2.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        var difference = num1 - num2
//        var product = num1 * num2
//        var quotient = num1 / num2

        binding.buttonAdd.setOnClickListener { getSum() }
        binding.buttonSubtract.setOnClickListener { getSum() }
        binding.buttonMultiply.setOnClickListener { getSum() }
        binding.buttonDivide.setOnClickListener { getSum() }
    }
    private fun getSum() {
        //variables declaration
        val input1 = binding.editTextInput1.text.toString()
        val num1 = input1.toDoubleOrNull()
        val input2 = binding.editTextInput2.text.toString()
        val num2 = input2.toDoubleOrNull()
        //process
        if (num1 == null || num2 == null) {
            binding.textViewResultLabel.text = "Input/s must not be blank."
            return
        }
        var sum = num1 + num2
        var formattedSum = NumberFormat.getNumberInstance().format(sum)
        binding.textViewResultLabel.text = getString(R.string.app_result_formatted, formattedSum)
    }
    private fun getDifference() {
        //variables declaration
        val input1 = binding.editTextInput1.text.toString()
        val num1 = input1.toDoubleOrNull()
        val input2 = binding.editTextInput2.text.toString()
        val num2 = input2.toDoubleOrNull()
        //process
        if (num1 == null || num2 == null) {
            binding.textViewResultLabel.text = "Input/s must not be blank."
            return
        }
        var difference = num1 - num2
        var formattedDifference = NumberFormat.getNumberInstance().format(difference)
        binding.textViewResultLabel.text = getString(R.string.app_result_formatted, formattedDifference)
    }
    private fun getProduct() {
        //variables declaration
        val input1 = binding.editTextInput1.text.toString()
        val num1 = input1.toDoubleOrNull()
        val input2 = binding.editTextInput2.text.toString()
        val num2 = input2.toDoubleOrNull()
        //process
        if (num1 == null || num2 == null) {
            binding.textViewResultLabel.text = "Input/s must not be blank."
            return
        }
        var product = num1 * num2
        var formattedProduct = NumberFormat.getNumberInstance().format(product)
        binding.textViewResultLabel.text = getString(R.string.app_result_formatted, formattedProduct)
    }
    private fun getQuotient() {
        //variables declaration
        val input1 = binding.editTextInput1.text.toString()
        val num1 = input1.toDoubleOrNull()
        val input2 = binding.editTextInput2.text.toString()
        val num2 = input2.toDoubleOrNull()
        //process
        if (num1 == null || num2 == null) {
            binding.textViewResultLabel.text = "Input/s must not be blank."
            return
        }
        var quotient = num1 / num2
        var formattedQuotient = NumberFormat.getNumberInstance().format(quotient)
        binding.textViewResultLabel.text = getString(R.string.app_result_formatted, formattedQuotient)
    }
}