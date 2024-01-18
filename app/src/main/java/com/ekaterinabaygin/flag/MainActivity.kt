package com.ekaterinabaygin.flag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FlagAdapter(
            listOf(
                Country("at", "Austria"),
                Country("pl", "Poland"),
                Country("it", "Italy"),
                Country("co", "Colombia"),
                Country("mg", "Madagascar"),
                Country("th", "Thailand"),
                Country("dk", "Denmark"),
                Country("se", "Sweden")
            )
        )
    }
}
