package com.tien.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var start = 0
        var startString:String
        val BT1 = findViewById<Button>(R.id.BT_Click)
        val TV_status = findViewById<TextView>(R.id.TV_status)

        Toast.makeText(applicationContext,"app start",Toast.LENGTH_SHORT).show()


        try {

            BT1.setOnClickListener {
                start++
                startString = start.toString()
                TV_status.setText(startString)
            }

        } catch (e : Exception){
            Log.e("App helper","catch")
        }


    }
}