package com.hariagus.submission1moviecataloge.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieEntity(
    val id: Int? = 0,
    val title: String? = null,
    val description: String? = null,
    val category: String? = null,
    val release: String? = null,
    val duration: String? = null,
    val image: String? = null,
    val backdrops: String? = null
) : Parcelable
