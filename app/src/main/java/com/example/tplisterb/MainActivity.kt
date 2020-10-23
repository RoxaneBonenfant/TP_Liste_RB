package com.example.tplisterb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val andVersionArray = mutableListOf<AndVersion>()

        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = AndVersionAdapter(andVersionArray)
        val items: MutableList<AndVersion>

    fun seedItems() {
        var nameArray = resources.getStringArray(R.array.andVersionName)
        val imgArray = intArrayOf(R.drawable.france, R.drawable.espagne)
        for (i in 0..(nameArray.size-1)){
            andVersionArray[i] = AndVersion(nameArray[i], imgArray[i])}
    }
    }
}