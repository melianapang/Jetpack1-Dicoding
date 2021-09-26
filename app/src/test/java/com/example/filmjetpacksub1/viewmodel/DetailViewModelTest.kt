package com.example.filmjetpacksub1.viewmodel

import com.example.filmjetpacksub1.utils.DataFilm
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class DetailViewModelTest : TestCase() {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataFilm.generateDummyFilm()[0]
    private val dummyShow = DataFilm.generateDummyTvShow()[0]

    @Before
    override fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setSelectedMovie("Alita: Battle Angel")
        viewModel.setSelectedTvShow("Arrow")
    }

    @Test
    fun testGetSelectedMovie() {
        val selectedMovie = viewModel.getSelectedMovie()
        assertNotNull(selectedMovie)
        assertEquals(dummyMovie.poster, selectedMovie.poster)
        assertEquals(dummyMovie.judul, selectedMovie.judul)
        assertEquals(dummyMovie.desc, selectedMovie.desc)
        assertEquals(dummyMovie.tanggal, selectedMovie.tanggal)
        assertEquals(dummyMovie.genre, selectedMovie.genre)
        assertEquals(dummyMovie.durationStr, selectedMovie.durationStr)
    }

    @Test
    fun testGetSelectedTvShow() {
        val selectedShow = viewModel.getSelectedTvShow()
        assertNotNull(selectedShow)
        assertEquals(dummyShow.poster, selectedShow.poster)
        assertEquals(dummyShow.judul, selectedShow.judul)
        assertEquals(dummyShow.desc, selectedShow.desc)
        assertEquals(dummyShow.tanggal, selectedShow.tanggal)
        assertEquals(dummyShow.genre, selectedShow.genre)
        assertEquals(dummyShow.durationStr, selectedShow.durationStr)
    }
}