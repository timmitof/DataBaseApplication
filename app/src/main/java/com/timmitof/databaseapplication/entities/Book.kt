package com.timmitof.databaseapplication.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Genre::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("genreId"))))
data class Book (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "bookName") var bookName: String,
    @ColumnInfo(name = "author") var author: String,
    @ColumnInfo(name = "publicationDate") var publicationDate: String,
    @ColumnInfo(name = "pageAmount") var pageAmount: Int,
    @ColumnInfo(name = "amount") var amount: Int,
    @ColumnInfo(name = "place") var place: String,
    @ColumnInfo(name = "genreId") var genreId: Int
)

@Entity
data class Genre (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "genreName") var name: String
)