package com.example.filmjetpacksub1.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.filmjetpacksub1.R
import com.example.filmjetpacksub1.utils.DataFilm
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.text.SimpleDateFormat

class MainActivityTest {
    private val dummyFilm = DataFilm.generateDummyFilm()
    private val dummyShows = DataFilm.generateDummyTvShow()
    private var dateFormFilm = ""
    private var dateFormShow= ""

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp(){
        val dateFormat = SimpleDateFormat("dd MMM yyyy")
        dateFormFilm = dateFormat.format(dummyFilm[0].tanggal)
        dateFormShow = dateFormat.format(dummyShows[0].tanggal)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_home)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyFilm.size
            )
        )
    }

    @Test
    fun loadTvShows() {
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_home)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyShows.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_home)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_judul_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_tahun_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.img_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_content)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_judul_detail)).check(matches(withText(dummyFilm[0].judul)))
        onView(withId(R.id.tv_date_detail)).check(matches(withText(dateFormFilm)))
        onView(withId(R.id.tv_overview_content)).check(matches(withText(dummyFilm[0].desc)))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyFilm[0].genre)))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyFilm[0].durationStr)))
    }

    @Test
    fun loadDetailTvShows() {
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_home)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        click()
                )
        )
        onView(withId(R.id.img_poster_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_judul_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_tahun_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.img_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_content)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_judul_detail)).check(matches(withText(dummyShows[0].judul)))
        onView(withId(R.id.tv_date_detail)).check(matches(withText(dateFormShow)))
        onView(withId(R.id.tv_overview_content)).check(matches(withText(dummyShows[0].desc)))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyShows[0].genre)))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyShows[0].durationStr)))
    }

    @Test
    fun shareMovie(){
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_home)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        click()
                )
        )
        onView(withId(R.id.btn_share)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share)).perform(click())
    }

    @Test
    fun shareTvShow(){
        onView(withId(R.id.rv_home)).check(matches(isDisplayed()))
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_home)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        click()
                )
        )
        onView(withId(R.id.btn_share)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share)).perform(click())
    }
}