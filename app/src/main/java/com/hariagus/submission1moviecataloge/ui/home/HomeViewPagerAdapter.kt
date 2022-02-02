package com.hariagus.submission1moviecataloge.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hariagus.submission1moviecataloge.ui.movie.MovieFragment
import com.hariagus.submission1moviecataloge.ui.tvshow.TvShowFragment

class HomeViewPagerAdapter(
    fManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fManager, lifecycle) {

    private val fragment: List<Fragment> = listOf(
        MovieFragment(),
        TvShowFragment()
    )

    override fun getItemCount(): Int = fragment.size

    override fun createFragment(position: Int): Fragment = fragment[position]
}