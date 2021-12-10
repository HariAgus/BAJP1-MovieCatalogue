package com.hariagus.submission1moviecataloge.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.ui.adapter.ContentAdapter
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var viewModel: MovieViewModel

    companion object {
        const val MOVIE = 0
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
            .get(MovieViewModel::class.java)

        val movie = viewModel.getMovies()
        val contentAdapter = ContentAdapter(MOVIE)
        contentAdapter.setData(movie)

        with(rvMovie) {
            setHasFixedSize(true)
            adapter = contentAdapter
        }
    }

}