package com.hariagus.submission1moviecataloge.ui.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hariagus.submission1moviecataloge.databinding.FragmentTvShowBinding
import com.hariagus.submission1moviecataloge.ui.adapter.ContentAdapter

class TvShowFragment : Fragment() {

    companion object {
        const val TV_SHOW = 1
    }

    private lateinit var viewModel: TvShowViewModel
    private lateinit var binding: FragmentTvShowBinding
    private val tvShowAdapter by lazy { ContentAdapter(TV_SHOW) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvShowBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(TvShowViewModel::class.java)

        tvShowAdapter.setData(viewModel.getTvShow())

        binding.rvTvShow.apply {
            setHasFixedSize(true)
            adapter = tvShowAdapter
        }

    }

}