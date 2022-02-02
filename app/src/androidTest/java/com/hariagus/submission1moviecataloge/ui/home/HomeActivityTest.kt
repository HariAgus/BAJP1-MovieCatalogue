package com.hariagus.submission1moviecataloge.ui.home

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.adevinta.android.barista.interaction.BaristaClickInteractions.clickOn
import com.adevinta.android.barista.interaction.BaristaListInteractions.clickListItem
import com.adevinta.android.barista.interaction.BaristaListInteractions.scrollListToPosition
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
        scrollListToPosition(R.id.rvMovie, dummyMovie.size)
    }

    /**
     * Testing move fragment to TV Show
     */
    @Test
    fun loadDataTvShow() {
        clickOn("TV SHOW")
        assertDisplayed(R.id.rvTvShow)
        scrollListToPosition(R.id.rvTvShow, dummyTvShow.size)
    }

    /**
     * Testing load detail data movie
     */
    @Test
    fun loadDetailMovie() {
        clickListItem(R.id.rvMovie, 0)
        assertDisplayed(R.id.tvTitleDetail, dummyMovie[0].title.orEmpty())
        assertDisplayed(R.id.tvReleaseDateDetail, dummyMovie[0].release.orEmpty())
        assertDisplayed(withContentDescription(R.string.content_desc_poster))
        assertDisplayed(R.id.tvCategoryDetail, dummyMovie[0].category.orEmpty())
        assertDisplayed(R.id.tvDurationDetail, dummyMovie[0].duration.orEmpty())
        assertDisplayed(R.id.tvDescDetail, dummyMovie[0].description.orEmpty())
    }

    /**
     * Testing load detail data tv show
     */
    @Test
    fun loadDetailTvShow() {
        clickOn("TV SHOW")
        clickListItem(R.id.rvTvShow, 0)
        assertDisplayed(R.id.tvTitleDetail, dummyTvShow[0].title.orEmpty())
        assertDisplayed(R.id.tvReleaseDateDetail, dummyTvShow[0].release.orEmpty())
        assertDisplayed(withContentDescription(R.string.content_desc_poster))
        assertDisplayed(R.id.tvCategoryDetail, dummyTvShow[0].category.orEmpty())
        assertDisplayed(R.id.tvDurationDetail, dummyTvShow[0].duration.orEmpty())
        assertDisplayed(R.id.tvDescDetail, dummyTvShow[0].description.orEmpty())
    }

}