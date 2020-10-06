package com.vogella.android.kotlincalculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() , View.OnClickListener{

    // TextView used to display the input and output
    private lateinit var txtOne: TextView
    private lateinit var txtTwo: TextView
    private lateinit var txtThree: TextView
    private lateinit var txtFour: TextView
    private lateinit var txtFive: TextView
    private lateinit var txtSix: TextView
    private lateinit var txtSeven: TextView
    private lateinit var txtEight: TextView
    private lateinit var txtNine: TextView
    private lateinit var txtZero: TextView
    private lateinit var txtDot: TextView

    private lateinit var tvExpression: TextView

    private lateinit var txtMul: TextView
    private lateinit var txtDiv: TextView
    private lateinit var txtAdd: TextView
    private lateinit var txtSub: TextView
    private lateinit var txtClear: TextView






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtOne = findViewById(R.id.tvOne) as TextView
        txtTwo = findViewById(R.id.tvTwo) as TextView
        txtThree = findViewById(R.id.tvThree) as TextView
        txtFour = findViewById(R.id.tvFour) as TextView
        txtFive = findViewById(R.id.tvFive) as TextView
        txtSix = findViewById(R.id.tvSix) as TextView
        txtSeven = findViewById(R.id.tvSeven) as TextView
        txtEight = findViewById(R.id.tvEight) as TextView
        txtNine = findViewById(R.id.tvNine) as TextView
        txtZero = findViewById(R.id.tvZero) as TextView
        txtDot = findViewById(R.id.tvDot) as TextView

        txtMul = findViewById(R.id.tvMul) as TextView
        txtDiv = findViewById(R.id.tvDivide) as TextView
        txtAdd = findViewById(R.id.tvPlus) as TextView
        txtSub = findViewById(R.id.tvMinus) as TextView

        tvExpression = findViewById(R.id.tvExpression) as TextView
        txtClear = findViewById(R.id.tvBack) as TextView

        txtOne.setOnClickListener(this)
        txtTwo.setOnClickListener(this)
        txtThree.setOnClickListener(this)
        txtFour.setOnClickListener(this)
        txtFive.setOnClickListener(this)
        txtSix.setOnClickListener(this)
        txtSeven.setOnClickListener(this)
        txtEight.setOnClickListener(this)
        txtNine.setOnClickListener(this)
        txtZero.setOnClickListener(this)
        txtDot.setOnClickListener(this)

        txtMul.setOnClickListener(this)
        txtDiv.setOnClickListener(this)
        txtAdd.setOnClickListener(this)
        txtSub.setOnClickListener(this)
        txtClear.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        when(v.id){
            txtOne.id ->{ setText("1") }
            txtTwo.id ->{ setText("2") }
            txtThree.id ->{ setText("3") }
            txtFour.id ->{ setText("4") }
            txtFive.id ->{ setText("5") }
            txtSix.id ->{ setText("6") }
            txtSeven.id ->{ setText("7") }
            txtEight.id ->{ setText("8") }
            txtNine.id ->{ setText("9") }
            txtZero.id ->{ setText("0") }
            txtMul.id ->{ setText("*") }
            txtDiv.id ->{ setText("/") }
            txtAdd.id ->{ setText("+") }
            txtSub.id ->{ setText("-") }
            txtDot.id ->{ setText(".") }
            txtClear.id ->{clear()}
        }
    }

    fun setText(value : String){
        var valString = tvExpression.text.toString()
        tvExpression.text = valString + value
    }

    fun clear(){
        var valString = tvExpression.text.toString()
        tvExpression.text = valString.dropLast(1)
    }

    val clickListener = View.OnClickListener { view ->

    }



}