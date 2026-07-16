package com.kerikir.movietheater.data

import androidx.annotation.DrawableRes
import com.kerikir.movietheater.R


data class MovieThumbnailState(
    val id: Int,
    @DrawableRes val img: Int
)



val UpcomingMoviesData = listOf(
    MovieThumbnailState(
        id = 0,
        img = R.drawable.img_movie_poster_3
    ),
    MovieThumbnailState(
        id = 1,
        img = R.drawable.img_movie_poster_1
    ),
    MovieThumbnailState(
        id = 2,
        img = R.drawable.img_movie_poster_0
    ),
    MovieThumbnailState(
        id = 3,
        img = R.drawable.img_movie_poster_8
    )
)