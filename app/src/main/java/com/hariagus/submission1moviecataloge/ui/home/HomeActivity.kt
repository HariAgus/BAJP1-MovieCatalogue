package com.hariagus.submission1moviecataloge.ui.home

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.hariagus.submission1moviecataloge.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbarHome)

        val viewPageAdapter = HomeViewPagerAdapter(this, supportFragmentManager)
        homeViewPager.adapter = viewPageAdapter
        tabLayoutHome.setupWithViewPager(homeViewPager)

        ivChangeLanguage.setOnClickListener {
            val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(intent)
        }
    }

}