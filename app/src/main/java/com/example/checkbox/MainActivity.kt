package com.example.checkbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox = findViewById(R.id.text)

        checkBox.setOnCheckedChangeListener { checked, isChecked ->
            if (isChecked){
                Toast.makeText(this, "Real Madrid Checked", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Real Madrid not checked", Toast.LENGTH_SHORT).show()
            }
        }


    }
}