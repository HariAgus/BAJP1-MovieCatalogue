package com.hariagus.submission1moviecataloge.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.hariagus.submission1moviecataloge.R
import com.hariagus.submission1moviecataloge.ui.home.HomeActivity
import com.hariagus.submission1moviecataloge.utils.Const.Companion.DELAY_MOVE

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
        }, DELAY_MOVE)
    }
}