package com.example.androidavanzado

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = CoroutineViewModel()

        val adapter = HeroAdapter()
        val heroList = findViewById<RecyclerView>(R.id.hero_list)

        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener{
         viewModel.lanzarCorrutinaConLaunch()

        }

        heroList.adapter = adapter
        heroList.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        adapter.notifyDataSetChanged()
    }
}