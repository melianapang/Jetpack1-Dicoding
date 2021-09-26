package com.example.filmjetpacksub1.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class HomeViewModelTest : TestCase() {
    private lateinit var viewModel: HomeViewModel

    @Before
    override fun setUp() {
        viewModel = HomeViewModel()
    }

    @Test
    fun testGetFilm() {
        val listFilm = viewModel.getFilm()
        assertNotNull(listFilm)
        assertEquals(10, listFilm.size)
    }

    @Test
    fun testGetTvShows() {
        val listShows = viewModel.getTvShows()
        assertNotNull(listShows)
        assertEquals(10, listShows.size)
    }
}