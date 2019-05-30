package com.example.iteradmin.may30project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayOf("dev","devi","duka","deviva","divisa","dariya","daru","siv",
                "simran","saho","salini","sahinsa")

        val search = findViewById<AutoCompleteTextView>(R.id.search)
        val adp =ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,data)
        search.setAdapter(adp)
        search.threshold = 1
    }
}
