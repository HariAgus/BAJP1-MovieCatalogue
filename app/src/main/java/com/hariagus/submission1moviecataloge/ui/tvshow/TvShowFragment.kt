package com.hariagus.submission1moviecataloge.ui.tvshow

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.ui.adapter.ContentAdapter
import kotlinx.android.synthetic.main.fragment_tv_show.*

class TvShowFragment : Fragment(R.layout.fragment_tv_show) {

    private lateinit var viewModel: TvShowViewModel

    companion object {
        const val TV_SHOW = 1
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
            .get(TvShowViewModel::class.java)

        val tvShow = viewModel.getTvShow()
        val contentAdapter = ContentAdapter(TV_SHOW)
        contentAdapter.setData(tvShow)

        with(rvTvShow) {
            setHasFixedSize(true)
            adapter = contentAdapter
        }
    }

}