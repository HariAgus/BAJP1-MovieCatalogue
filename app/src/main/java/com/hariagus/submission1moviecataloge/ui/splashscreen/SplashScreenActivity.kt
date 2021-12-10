package com.hariagus.submission1moviecataloge.ui.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.databinding.ActivitySplashScreenBinding
import com.hariagus.submission1moviecataloge.ui.home.HomeActivity
import com.hariagus.submission1moviecataloge.utils.Const.Companion.DELAY_MOVE

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
        }, DELAY_MOVE)
    }
}