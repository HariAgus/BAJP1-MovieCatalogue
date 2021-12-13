package com.hariagus.submission1moviecataloge.ui.movie

import com.hariagus.submission1moviecataloge.model.MovieEntity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel
    private lateinit var movieEntity: MovieEntity
    private val id = 0
    private val title = "Alita 2019"
    private val description =
        "When Alita awakens with no memory of who she is in a future world she does not recognize," +
                " she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is " +
                "the heart and soul of a young woman with an extraordinary past."
    private val category = "Action, Adventure"
    private val release = "14 February 2019"
    private val duration = "2h 42m"
    private val image =
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg"


    @Before
    fun setUp() {
        viewModel = MovieViewModel()
        movieEntity = MovieEntity(
            id, title, description, category, release, duration, image
        )
    }

    @Test
    fun getMovies() {
        val dataMovie = viewModel.getMovies()
        assertNotNull(dataMovie)
        assertEquals(10, dataMovie.size)
    }

    @Test
    fun detailMovie() {
        assertEquals(movieEntity.id, viewModel.detailMovie(0).id)
        assertEquals(movieEntity.title, viewModel.detailMovie(0).title)
        assertEquals(movieEntity.description, viewModel.detailMovie(0).description)
        assertEquals(movieEntity.category, viewModel.detailMovie(0).category)
        assertEquals(movieEntity.release, viewModel.detailMovie(0).release)
        assertEquals(movieEntity.duration, viewModel.detailMovie(0).duration)
        assertEquals(movieEntity.image, viewModel.detailMovie(0).image)
    }

}