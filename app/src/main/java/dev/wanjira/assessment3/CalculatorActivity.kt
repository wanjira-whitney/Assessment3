package dev.wanjira.assessment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculatorActivity: AppCompatActivity() {
    lateinit var tvResults: TextView
    lateinit var etNum1: TextInputLayout
    lateinit var etNum2: TextInputLayout
    lateinit var tilNum1: TextInputEditText
    lateinit var tilNum2: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnModulus: Button
    lateinit var btnDivide: Button

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_calculator)
        etNum1=findViewById(R.id.etNumber1)
        etNum2=findViewById(R.id.etNumber2)
        btnAdd=findViewById(R.id.btn_add)
        btnSub=findViewById(R.id.btn_subtract)
        btnDivide=findViewById(R.id.btn_division)
        btnModulus=findViewById(R.id.btn_modulus)
        tvResults=findViewById(R.id.tvResults)
        tilNum1=findViewById(R.id.tilNumber1)
        tilNum2=findViewById(R.id.tilNumber2)


        btnAdd.setOnClickListener {
            val num1=etNum1.editText.toString().toDouble()
            val num2=etNum2.editText.toString().toDouble()
            sum(num1,num2)
        }
        btnSub.setOnClickListener {
            val num1=etNum1.editText.toString().toDouble()
            val num2=etNum2.editText.toString().toDouble()
            subtract(num1,num2)
        }
        btnSub.setOnClickListener {
            val num1=etNum1.editText.toString().toDouble()
            val num2=etNum2.editText.toString().toDouble()
            modulus(num1,num2)
        }
        btnSub.setOnClickListener {
            val num1=etNum1.editText.toString().toDouble()
            val num2=etNum2.editText.toString().toDouble()
            divide(num1,num2)
        }

    }

    fun sum(num1:Double,num2:Double){
        val add = num1 + num2
        tvResults.text=add.toString()
    }
    fun subtract(num1:Double,num2:Double){
        val subtract = num1 + num2
        tvResults.text=subtract.toString()
    }
    fun modulus(num1:Double,num2:Double){
        val modulus = num1 + num2
        tvResults.text=modulus.toString()
    }
    fun divide(num1:Double,num2:Double){
        val divide = num1 + num2
        tvResults.text=divide.toString()
    }
    fun validation() {
        var error = false
        tilNum1.error = null
        tilNum2.error = null
        val numOne = etNum1.editText.toString()
        val numTwo = etNum2.editText.toString()

        if (numOne.isBlank()) {
            tilNum1.error = "Enter first number"
            error = true
        }
        if (numTwo.isBlank()) {
            tilNum2.error = "Enter second number"
            error = true
        }
    }
}