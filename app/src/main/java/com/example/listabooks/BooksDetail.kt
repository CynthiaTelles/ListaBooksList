package com.example.listabooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import java.util.zip.Inflater

class BooksDetail : AppCompatActivity() {

    companion object{
        val BOOKS_TITLE_EXTRA ="books.title.extra.detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_detail)

        //Recuperar a string da tela anterior
        val title: String = intent.getStringExtra(BOOKS_TITLE_EXTRA) ?: ""

        //Recuperar o campo do XML
        val tvTitle = findViewById<TextView>(R.id.textview_title_detail)

        //setar um novo texto na tela
        tvTitle.text = title

    }

    //Cria e infla o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_books_detail,menu)
        return true
    }

    //Ação do menu, ele checa qual foi a opção do menu clicada atraves do ID.
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.delete_book ->{
                TODO()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

}