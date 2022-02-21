package com.timmitof.databaseapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timmitof.databaseapplication.dao.BookDao
import com.timmitof.databaseapplication.dao.GenreDao
import com.timmitof.databaseapplication.entities.Book
import com.timmitof.databaseapplication.entities.Genre

@Database(entities = [Book::class, Genre::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
    abstract fun GenreDao(): GenreDao
}