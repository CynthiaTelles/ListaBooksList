package com.example.listabooks

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.tool_bar))


        val list: RecyclerView = findViewById(R.id.rv_booksList)
        list.layoutManager = LinearLayoutManager(this)
        list.setHasFixedSize(true)

        val adapter =  BooksListAdapter (FakeList(), ::openPageBooksDetail)

        list.adapter = adapter

    }

    private fun openPageBooksDetail (page:DataBooks){

        val intent = Intent (this, BooksDetail::class.java)
            .apply {
                putExtra(BooksDetail.BOOKS_TITLE_EXTRA, page.title)
            }
        startActivity(intent)

    }


}




