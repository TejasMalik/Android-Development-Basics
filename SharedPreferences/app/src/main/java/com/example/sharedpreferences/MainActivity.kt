package com.example.sharedpreferences

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sPref = getPreferences(Context.MODE_PRIVATE)
        val color = sPref.getInt("COLOR", Color.WHITE)
        llBackground.setBackgroundColor(color)

        fun saveColor(color: Int) {
            var editor = sPref.edit()
            editor.putInt("COLOR", color)
            editor.apply()
        }



        btnRed.setOnClickListener {
            llBackground.setBackgroundColor(Color.RED)
            saveColor(Color.RED)
        }

        btnBlue.setOnClickListener {
            llBackground.setBackgroundColor(Color.BLUE)
            saveColor(Color.BLUE)

        }

        btnGreen.setOnClickListener {
            llBackground.setBackgroundColor(Color.GREEN)
            saveColor(Color.GREEN)
        }
    }
}