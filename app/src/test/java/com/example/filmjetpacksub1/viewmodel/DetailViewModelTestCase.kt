package com.example.filmjetpacksub1.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import java.text.DateFormat
import java.text.SimpleDateFormat

class DetailViewModelTestCase : TestCase() {
    private lateinit var viewModel: DetailViewModel

    @get:Rule
    var thrown: ExpectedException = ExpectedException.none()

    @Before
    override fun setUp() {
        viewModel = DetailViewModel()
    }

    @Test
    @Throws(NullPointerException::class)
    fun testEmptyDataMovie() {
        viewModel.setSelectedMovie("")
        val name = viewModel.getSelectedMovie()
        thrown.expect(NullPointerException::class.java)
        assertEquals("The data is empty", "", name.judul)
    }

    @Test
    @Throws(NullPointerException::class)
    fun testEmptyDataTvShows() {
        viewModel.setSelectedTvShow("")
        val name = viewModel.getSelectedTvShow()
        thrown.expect(NullPointerException::class.java)
        assertEquals("The data is empty", "", name.judul)
    }

    @Test
    fun testFalseFullDateFormat() {
        viewModel.setSelectedTvShow("Arrow")
        val dummyData = viewModel.getSelectedTvShow()
        val dateFormat: DateFormat = SimpleDateFormat("MM/dd/yyyy")
        val date = dateFormat.format(dummyData.tanggal)
        assertNotSame("The data are the same", dummyData.tanggal, date)
    }
}