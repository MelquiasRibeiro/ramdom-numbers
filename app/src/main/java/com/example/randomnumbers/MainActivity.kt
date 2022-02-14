package com.example.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var resultAppText = findViewById<TextView>(R.id.resultText)

        var randomChoseNumber = findViewById<Button>(R.id.playButton)
            randomChoseNumber.setOnClickListener{
                var choosedNumber = (0 until 10).random().toString()

                resultAppText.text =  "O número sorteado: $choosedNumber "
            }

    }




}