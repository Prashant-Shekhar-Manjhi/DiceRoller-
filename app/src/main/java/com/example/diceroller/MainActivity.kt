package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.dice)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            showRandomNumber()
            Toast.makeText(this,"Rolled",Toast.LENGTH_LONG).show()
        }
    }
    private fun showRandomNumber(){
        val range = 1..6

        val image = findViewById<ImageView>(R.id.dice)
        when(range.random()){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            else -> image.setImageResource(R.drawable.dice_6)
        }
    }


}