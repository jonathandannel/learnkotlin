package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleCalculate(view: View) {
        val yearOfBirth: Int = birthdayInput.text.toString().toInt();
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR);
        val age: Int = currentYear - yearOfBirth;
        resultText.text = age.toString()
    }
}
