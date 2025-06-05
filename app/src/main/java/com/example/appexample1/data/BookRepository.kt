package com.example.appexample1.data

class BookRepository {

    private val bookList = mutableListOf(

        Book(1,"Mi nombre es Emilia del Valle", "", "Allende Isabel1", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", true),
        Book(2,"El loco de Dios en el fin del mundo", "", "Cercas, Javier", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", true),
        Book(3,"La península de las casas vacías", "", "Uclés, David", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", true),
        Book(4,"Por si un día volvemos", "", "Dueñas, María", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", false),
        Book(5,"El puente donde habitan las mariposas", "", "Castellanos, Nazareth", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", false),
        Book(6,"El asesinato de Aristóteles", "", "Chicot, Marcos", 1980,
            "Una inolvidable historia de amor y de guerra protagonizada por una mujer que, enfrentada a los mayores desafíos",
            "image", false)

    )

    fun getBooks(): List<Book> = bookList

    fun toggleBookmark(bookId: Int) {
        val index = bookList.indexOfFirst { it.id == bookId }
        if (index != -1) {
            val current = bookList[index]
            bookList[index] = current.copy(isBookMarked = !current.isBookMarked)
        }
    }

}