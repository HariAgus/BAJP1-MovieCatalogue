package com.hariagus.submission1moviecataloge.ui.home

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.ui.movie.MovieFragment
import com.hariagus.submission1moviecataloge.ui.tvshow.TvShowFragment

class HomeViewPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitle = intArrayOf(
        R.string.movies_title,
        R.string.tvhShow_title
    )

    private val fragment: List<Fragment> = listOf(
        MovieFragment(),
        TvShowFragment()
    )

    override fun getPageTitle(position: Int): CharSequence {
        return context.getString(tabTitle[position])
    }

    override fun getCount(): Int = tabTitle.size

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }
}