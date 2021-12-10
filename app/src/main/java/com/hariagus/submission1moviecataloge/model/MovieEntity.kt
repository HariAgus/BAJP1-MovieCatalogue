package com.hariagus.submission1moviecataloge.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieEntity(
    var id: Int? = 0,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var release: String? = null,
    var duration: String? = null,
    var image: String? = null
) : Parcelable
