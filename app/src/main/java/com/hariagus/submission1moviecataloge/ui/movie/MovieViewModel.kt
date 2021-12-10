package com.hariagus.submission1moviecataloge.ui.movie

import androidx.lifecycle.ViewModel
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.utils.DataMovies

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DataMovies.generateDummyMovies()
    fun detailMovie(id: Int): MovieEntity = DataMovies.getMovieDetail(id)

}