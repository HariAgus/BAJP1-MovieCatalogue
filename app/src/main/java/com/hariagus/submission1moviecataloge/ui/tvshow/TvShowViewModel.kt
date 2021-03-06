package com.hariagus.submission1moviecataloge.ui.tvshow

import androidx.lifecycle.ViewModel
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.utils.DataTVShow

class TvShowViewModel : ViewModel() {

    fun getTvShow(): List<MovieEntity> = DataTVShow.generateDummyTvMovies()
    fun detailTvShow(id: Int): MovieEntity = DataTVShow.getDetailTvShow(id)

}