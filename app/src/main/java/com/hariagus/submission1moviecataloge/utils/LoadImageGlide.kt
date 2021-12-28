package com.hariagus.submission1moviecataloge.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hariagus.submission1moviecataloge.R

fun Context.loadImageGlide(url: String?, imageView: ImageView) {
    Glide.with(this)
        .load(url)
        .apply(RequestOptions().placeholder(R.drawable.loading_animation))
        .into(imageView)
}