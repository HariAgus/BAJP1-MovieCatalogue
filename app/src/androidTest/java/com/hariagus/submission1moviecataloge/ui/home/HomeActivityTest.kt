package com.hariagus.submission1moviecataloge.ui.home

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.adevinta.android.barista.interaction.BaristaClickInteractions.clickOn
import com.adevinta.android.barista.interaction.BaristaListInteractions.clickListItem
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.utils.DataMovies
import com.hariagus.submission1moviecataloge.utils.DataTVShow
import org.junit.Before
import org.junit.Test

class HomeActivityTest {

    private val dummyMovie = DataMovies.generateDummyMovies()
    private val dummyTvShow = DataTVShow.generateDummyTvMovies()

    /**
     * Setup Preview
     */
    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    /**
     * Give action on icon change language
     */
    @Test
    fun clickChangeLanguage() {
        clickOn(R.id.ivChangeLanguage)
    }

    /**
     * Testing load data movie
     */
    @Test
    fun loadDataMovie() {
        assertDisplayed(R.id.rvMovie)
        clickListItem(R.id.rvMovie, dummyMovie.size)
    }

    /**
     * Testing move fragment to TV Show
     */
    @Test
    fun loadDataTvShow() {
        clickOn("TV SHOW")
        assertDisplayed(R.id.rvTvShow)
        clickListItem(R.id.rvTvShow, dummyTvShow.size)
    }

    /**
     * Testing load detail data movie
     */
    @Test
    fun loadDetailMovie() {
        clickListItem(R.id.rvMovie, 0)
        assertDisplayed(R.id.tvTitleDetail)
        assertDisplayed(R.id.tvReleaseDateDetail)
        assertDisplayed(R.id.imgDetail)
        assertDisplayed(R.id.tvCategoryDetail)
        assertDisplayed(R.id.tvDurationDetail)
        assertDisplayed(R.id.tvDescDetail)
    }

    /**
     * Testing load detail data tv show
     */
    @Test
    fun loadDetailTvShow() {
        clickOn("TV SHOW")
        onView(withText("TV SHOW")).perform(click())
        clickListItem(R.id.rvTvShow, 0)
        assertDisplayed(R.id.tvTitleDetail)
        assertDisplayed(R.id.tvReleaseDateDetail)
        assertDisplayed(R.id.imgDetail)
        assertDisplayed(R.id.tvCategoryDetail)
        assertDisplayed(R.id.tvDurationDetail)
        assertDisplayed(R.id.tvDescDetail)
    }

}