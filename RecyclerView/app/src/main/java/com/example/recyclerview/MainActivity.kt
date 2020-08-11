package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = Fruit.genRandomFruits(100)
        val fruitAdapter = FruitAdapter(fruits)

        rvFruits.layoutManager = LinearLayoutManager(this)
        rvFruits.adapter = fruitAdapter
    }
}