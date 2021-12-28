package com.hariagus.submission1moviecataloge.ui.tvshow

import com.hariagus.submission1moviecataloge.model.MovieEntity
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel
    private lateinit var movieEntity: MovieEntity
    private val id = 0
    private val title = "The Good Doctor"
    private val description =
        "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. " +
                "The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?"
    private val category = "Drama"
    private val release = "2017"
    private val duration = "42m"
    private val image =
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
        movieEntity = MovieEntity(id, title, description, category, release, duration, image)
    }

    @Test
    fun getTvShow() {
        val dataTvShow = viewModel.getTvShow()
        assertNotNull(dataTvShow)
        assertEquals(10, dataTvShow.size)
    }

    @Test
    fun detailTvShow() {
        assertEquals(movieEntity.id, viewModel.detailTvShow(0).id)
        assertEquals(movieEntity.title, viewModel.detailTvShow(0).title)
        assertEquals(movieEntity.description, viewModel.detailTvShow(0).description)
        assertEquals(movieEntity.category, viewModel.detailTvShow(0).category)
        assertEquals(movieEntity.release, viewModel.detailTvShow(0).release)
        assertEquals(movieEntity.duration, viewModel.detailTvShow(0).duration)
        assertEquals(movieEntity.image, viewModel.detailTvShow(0).image)
    }
}