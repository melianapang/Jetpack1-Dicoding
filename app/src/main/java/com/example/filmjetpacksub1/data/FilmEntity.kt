package com.example.filmjetpacksub1.data

import java.util.*

data class FilmEntity(
    val judul: String = "",
    val tanggal: Date = Date(2018),
    val poster: Int = 0,
    val desc: String = "",
    val genre: String = "",
    val durationStr: String = ""
)