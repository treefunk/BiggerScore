package com.example.biggerscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()


    }

    fun leftButtonClick(view: View){
        val btnLeft  = findViewById<Button>(R.id.button1)
        val btnRight = findViewById<Button>(R.id.button2)

        val leftNum  = btnLeft.text.toString().toInt()
        val rightNum = btnRight.text.toString().toInt()

        if(leftNum > rightNum){
            points++
        }else{
            points--
        }

        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()
    }

    fun rightButtonClick(view: View){
        val btnLeft  = findViewById<Button>(R.id.button1)
        val btnRight = findViewById<Button>(R.id.button2)

        val leftNum  = btnLeft.text.toString().toInt()
        val rightNum = btnRight.text.toString().toInt()

        if(rightNum > leftNum){
            points++
        }else{
            points--
        }

        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()
    }

    fun pickRandomNumbers(){

        val btnLeft  = findViewById<Button>(R.id.button1)
        val btnRight = findViewById<Button>(R.id.button2)

        val r = Random()
        val num1 = r.nextInt(10)
        btnLeft.text = "$num1"
        val num2 = r.nextInt(10)
        btnRight.text = "$num2"

    }

}
