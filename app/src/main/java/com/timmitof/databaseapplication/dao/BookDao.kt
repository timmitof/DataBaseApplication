package com.timmitof.databaseapplication.dao

import androidx.room.*
import com.timmitof.databaseapplication.App
import com.timmitof.databaseapplication.database.AppDatabase
import com.timmitof.databaseapplication.entities.Book

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addBook(vararg book: Book)

    @Query("SELECT * FROM Book")
    fun getAllBooks(): List<Book>

    @Query("INSERT INTO Book (bookName, author) VALUES (:name, :author)")
    fun add(name: String, author: String)

    @Delete
    fun delBook(book: Book)
}