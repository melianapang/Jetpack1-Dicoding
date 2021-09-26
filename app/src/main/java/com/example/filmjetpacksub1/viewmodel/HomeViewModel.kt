package com.example.filmjetpacksub1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.filmjetpacksub1.data.FilmEntity
import com.example.filmjetpacksub1.utils.DataFilm

class HomeViewModel : ViewModel() {
    fun getFilm(): ArrayList<FilmEntity> = DataFilm.generateDummyFilm()
    fun getTvShows(): ArrayList<FilmEntity> = DataFilm.generateDummyTvShow()
}