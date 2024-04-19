package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        result = findViewById(R.id.resultView)

        button.setOnClickListener {
            var value:String = editText.text.toString()
            var num:Double = value.toDouble()
            num *= 0.012
            result.text = num.toString()
        }
    }
}