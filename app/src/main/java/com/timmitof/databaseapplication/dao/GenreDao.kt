package com.timmitof.databaseapplication.dao

import androidx.room.*
import com.timmitof.databaseapplication.entities.Genre

@Dao
interface GenreDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addGenre(vararg genre: Genre)

    @Query("SELECT * FROM Genre")
    fun getAllGenre(): List<Genre>

    @Delete
    fun deleteGenre(genre: Genre)

    @Update
    fun updateGenre(genre: Genre)
}