package com.hariagus.submission1moviecataloge.ui.home

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.hariagus.submission1moviecataloge.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarHome)

        val viewPageAdapter = HomeViewPagerAdapter(
            this, supportFragmentManager
        )

        binding.apply {
            homeViewPager.adapter = viewPageAdapter
            tabLayoutHome.setupWithViewPager(homeViewPager)
        }

        binding.ivChangeLanguage.setOnClickListener {
            val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(intent)
        }
    }

}