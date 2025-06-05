package com.example.appexample1.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appexample1.data.Book
import com.example.appexample1.data.BookRepository

class BookViewModel(): ViewModel() {

    private val repository = BookRepository()

    private val _books = MutableLiveData<List<Book>>()
    val books: LiveData<List<Book>> = _books

    init {
        _books.value = sortBooks(repository.getBooks())
    }

    fun onBookmarkClicked(bookId: Int) {
        repository.toggleBookmark(bookId)
        _books.value = sortBooks(repository.getBooks())
    }

    private fun sortBooks(list: List<Book>): List<Book> {
        return list.sortedWith(
            compareByDescending<Book> { it.isBookMarked }
                .thenBy { it.bookTittle }
        )
    }

}