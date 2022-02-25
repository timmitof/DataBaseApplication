package com.timmitof.databaseapplication.dao

import androidx.room.*
import com.timmitof.databaseapplication.entities.Genre

@Dao
interface GenreDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addGenre(vararg genre: Genre)

    @Query("SELECT * FROM Genre")
    fun getAllGenre(): List<Genre>

    @Query("SELECT name FROM Genre")
    fun getNameGenre(): List<String>

    @Query("SELECT idGenre FROM Genre")
    fun getIdGenre():List<Int>

    @Delete
    fun deleteGenre(genre: Genre)

    @Update
    fun updateGenre(genre: Genre)
}