package com.hariagus.submission1moviecataloge.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.databinding.FragmentMovieBinding
import com.hariagus.submission1moviecataloge.ui.adapter.ContentAdapter
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {

    companion object {
        const val MOVIE = 0
    }

    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel
    private val movieAdapter by lazy { ContentAdapter(MOVIE) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(MovieViewModel::class.java)

        movieAdapter.setData(viewModel.getMovies())

        binding.rvMovie.apply {
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

}