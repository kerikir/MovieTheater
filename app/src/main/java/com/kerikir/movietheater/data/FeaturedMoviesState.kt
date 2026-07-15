package com.kerikir.movietheater.data

import androidx.annotation.DrawableRes

data class FeaturedMoviesState(
    val id: Int,
    @DrawableRes val img: Int,
    val title: String,
    val description: String,
    val timeSlots: List<String>
)
