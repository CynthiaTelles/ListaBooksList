package com.example.listabooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class BooksListAdapter(
    private val books: MutableList<DataBooks>,
    private val openPageBooksDetail : (page: DataBooks) -> Unit

    ):RecyclerView.Adapter <BooksListViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksListViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BooksListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BooksListViewHolder, position: Int) {
        val item = books[position]
        holder.bind(item, openPageBooksDetail)
    }

}

  class BooksListViewHolder (private val itemView: View) : RecyclerView.ViewHolder (itemView) {

      val cover = itemView.findViewById<ImageView>(R.id.foto_capa)
      val tvNomeLivro = itemView.findViewById<TextView>(R.id.tv_nome_livro)
      val tvAutor = itemView.findViewById<TextView>(R.id.tv_autor)
      val tvResenha = itemView.findViewById<TextView>(R.id.tv_resenha)
      val ImgStar = itemView.findViewById<ImageView>(R.id.img_star)


      fun bind(livros: DataBooks, openPageBooksDetail: (page:DataBooks) -> Unit){

             cover.setImageDrawable(ContextCompat.getDrawable(itemView.context,livros.cover))
             tvNomeLivro.text = livros.title
             tvAutor.text = livros.autor
             tvResenha.text = livros.resenha

             ImgStar.setImageResource(
                 if (livros.stared) R.drawable.baseline_star_24
                    else R.drawable.baseline_star_border_24
             )

            itemView.setOnClickListener{
                openPageBooksDetail.invoke(livros)
            }

      }

  }




