package com.hariagus.submission1moviecataloge.ui.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.utils.DataMovies
import com.hariagus.submission1moviecataloge.utils.DataTVShow
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.Test


class HomeActivityTest {

    private val dummyMovie = DataMovies.generateDummyMovies()
    private val dummyTvShow = DataTVShow.generateDummyTvMovies()
    private val dataEmpty = emptyList<MovieEntity>()

    /**
     * Setup Preview
     */
    @Before
    fun setup() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    /**
     * Give action on icon change language
     */
    @Test
    fun clickChangeLanguage() {
        onView(withId(R.id.ivChangeLanguage)).perform(click())
    }

    /**
     * Testing load data movie
     */
    @Test
    fun loadDataMovie() {
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    /**
     * Testing move fragment to TV Show
     */
    @Test
    fun loadDataTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTvShow.size
            )
        )
    }

    /**
     * Testing load detail data movie
     */
    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rvMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tvTitleDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].title)))
        }
        onView(withId(R.id.tvReleaseDateDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].release)))
        }
        onView(withId(R.id.tvCategoryDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].category)))
        }
        onView(withId(R.id.tvDurationDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].duration)))
        }
        onView(withId(R.id.tvDescDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyMovie[0].description)))
        }
    }

    /**
     * Testing load detail data tv show
     */
    @Test
    fun loadDetailTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rvTvShow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tvTitleDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTvShow[0].title)))
        }
        onView(withId(R.id.tvReleaseDateDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTvShow[0].release)))
        }
        onView(withId(R.id.tvCategoryDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTvShow[0].category)))
        }
        onView(withId(R.id.tvDurationDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTvShow[0].duration)))
        }
        onView(withId(R.id.tvDescDetail)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(dummyTvShow[0].description)))
        }
    }

    /**
     * Testing Empty Data
     */
    @Test
    fun emptyData() {
        if (dataEmpty.isNullOrEmpty()) {
            onView(withId(R.id.lottieEmptyDataMovie)).perform(setVisibility(true))
            onView(withId(R.id.rvMovie)).perform(setVisibility(false))
            onView(withText("TV SHOW")).perform(click())
            onView(withId(R.id.lottieEmptyDataTvShow)).perform(setVisibility(true))
            onView(withId(R.id.rvTvShow)).perform(setVisibility(false))
        } else {
            onView(withId(R.id.lottieEmptyDataMovie)).perform(setVisibility(false))
            onView(withId(R.id.rvMovie)).perform(setVisibility(true))
            onView(withText("TV SHOW")).perform(click())
            onView(withId(R.id.lottieEmptyDataTvShow)).perform(setVisibility(false))
            onView(withId(R.id.rvTvShow)).perform(setVisibility(true))
        }
    }

    private fun setVisibility(value: Boolean): ViewAction {
        return object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isAssignableFrom(View::class.java)
            }

            override fun perform(uiController: UiController?, view: View) {
                view.visibility = if (value) View.VISIBLE else View.GONE
            }

            override fun getDescription(): String {
                return "Show / Hide View"
            }
        }
    }

}