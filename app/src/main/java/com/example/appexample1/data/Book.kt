package com.example.appexample1.data

import android.R

data class Book(

    val id: Int,
    val bookTittle: String,
    val bookSubTittle: String,
    val author: String,
    val year: Int,
    val synopsis: String,
    val image: String,
    val isBookMarked: Boolean

)