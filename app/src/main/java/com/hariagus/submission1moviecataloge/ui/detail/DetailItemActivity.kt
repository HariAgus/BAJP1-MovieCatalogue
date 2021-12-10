package com.hariagus.submission1moviecataloge.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.model.MovieEntity
import com.hariagus.submission1moviecataloge.ui.movie.MovieFragment.Companion.MOVIE
import com.hariagus.submission1moviecataloge.ui.movie.MovieViewModel
import com.hariagus.submission1moviecataloge.ui.tvshow.TvShowFragment.Companion.TV_SHOW
import com.hariagus.submission1moviecataloge.ui.tvshow.TvShowViewModel
import kotlinx.android.synthetic.main.activity_detail.*


class DetailItemActivity : AppCompatActivity() {

    companion object {
        const val ID_DATA = "id_data"
        const val CLICK = "click"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movieViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
            .get(MovieViewModel::class.java)
        val tvShowViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
            .get(TvShowViewModel::class.java)

        when(intent.getIntExtra(CLICK, 0)) {
            MOVIE -> dataDetail(movieViewModel.detailMovie(intent.getIntExtra(ID_DATA, 0)))
            TV_SHOW -> dataDetail(tvShowViewModel.detailTvShow(intent.getIntExtra(ID_DATA,0)))
        }

    }

    private fun dataDetail(dataMovie: MovieEntity) {
        tvTitleDetail.text = dataMovie.title
        tvReleaseDateDetail.text = dataMovie.release
        tvCategoryDetail.text = dataMovie.category
        tvDurationDetail.text = dataMovie.duration
        tvDescDetail.text = dataMovie.description

        Glide.with(this)
            .load(dataMovie.image)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
            )
            .into(imgDetail)
    }

}