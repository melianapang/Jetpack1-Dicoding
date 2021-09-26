package com.example.filmjetpacksub1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.filmjetpacksub1.data.FilmEntity
import com.example.filmjetpacksub1.utils.DataFilm

class DetailViewModel : ViewModel() {
    private lateinit var movieName: String
    private lateinit var showName: String

    fun setSelectedMovie(movieName: String) {
        this.movieName = movieName
    }

    fun setSelectedTvShow(showName: String) {
        this.showName = showName
    }

    fun getSelectedMovie(): FilmEntity {
        var selectedMovie = FilmEntity()
        val movies = DataFilm.generateDummyFilm()
        for (movie in movies) {
            if (movie.judul == movieName) {
                selectedMovie = movie
                break
            }
        }
        return selectedMovie
    }

    fun getSelectedTvShow(): FilmEntity {
        var selectedShow = FilmEntity()
        val shows = DataFilm.generateDummyTvShow()
        for (show in shows) {
            if (show.judul == showName) {
                selectedShow = show
                break
            }
        }
        return selectedShow
    }
}