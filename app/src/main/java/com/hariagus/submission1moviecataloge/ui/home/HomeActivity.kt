package com.hariagus.submission1moviecataloge.ui.home

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.databinding.ActivityHomeBinding
import com.hariagus.submission1moviecataloge.ui.home.topmovie.TopMovieAdapter
import com.hariagus.submission1moviecataloge.utils.DataMovies

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarHome)
        binding.topCinema.startAutoCycle()

        val viewPageAdapter = HomeViewPagerAdapter(
            supportFragmentManager, lifecycle
        )
        binding.homeViewPager.adapter = viewPageAdapter
        TabLayoutMediator(
            binding.tabLayoutHome,
            binding.homeViewPager
        ) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.movie)
                1 -> tab.text = getString(R.string.tv_show)
            }
        }.attach()

        onClick()
        setupBanner()
    }

    private fun onClick() {
        binding.ivChangeLanguage.setOnClickListener {
            val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(intent)
        }
    }

    private fun setupBanner() {
        val topMovieAdapter = TopMovieAdapter()
        binding.topCinema.setSliderAdapter(topMovieAdapter)
        topMovieAdapter.setData(DataMovies.generateDummyMovies().shuffled())
    }

}