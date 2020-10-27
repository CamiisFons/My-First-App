package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var celsiusRadio: RadioButton
    lateinit var fahreinheitRadio: RadioButton
    lateinit var converterbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp)

        celsiusRadio = findViewById(R.id.celsiusRadio)
        fahreinheitRadio = findViewById(R.id.FahreinheitRadio)

        converterbutton = findViewById(R.id.converterButton)
        converterbutton.setOnClickListener{ converter(it) }

    }

    private fun converter (view: View) {
        var temp = editText.text.toString().toDouble()
        if (celsiusRadio.isChecked) temp = (temp - 32) * 5/9 else if (fahreinheitRadio.isChecked){
             temp = (temp * 9/5 + 32)
        }
        editText.setText(temp.toString())
    }
}