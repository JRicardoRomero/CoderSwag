package com.rommultimedia.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rommultimedia.coderswag.Adapters.CategoryAdapter
import com.rommultimedia.coderswag.R
import com.rommultimedia.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        CategoryListView.adapter = adapter
    }
}
