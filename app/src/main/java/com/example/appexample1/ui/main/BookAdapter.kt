package com.example.appexample1.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appexample1.R
import com.example.appexample1.data.Book

class BookAdapter(
    private var books: List<Book>,
    private val onBookmarkClick: (Int) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    inner class BookViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.tituloLibro)
        val author = view.findViewById<TextView>(R.id.autorLibro)
        val year = view.findViewById<TextView>(R.id.anioLibro)
        val bookmark = view.findViewById<ImageButton>(R.id.bookmark_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(v)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.title.text = book.bookTittle
        holder.author.text = book.author
        holder.year.text = book.year.toString()
        holder.bookmark.setImageResource(
            if (book.isBookMarked) R.drawable.ic_bookmark_filled else R.drawable.ic_bookmark_border
        )

        holder.bookmark.setOnClickListener {
            onBookmarkClick(book.id)
        }
    }

    fun updateData(newBooks: List<Book>) {
        books = newBooks
        notifyDataSetChanged()
    }
}