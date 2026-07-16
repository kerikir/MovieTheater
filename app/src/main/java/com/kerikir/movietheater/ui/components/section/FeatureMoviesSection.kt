package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.FeaturedMovieState
import com.kerikir.movietheater.ui.components.SectionHeader


@Composable
fun FeatureMoviesSection(
    modifier: Modifier = Modifier,
    data: List<FeaturedMovieState>
) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            text = "Featured Movies"
        )
        LazyRow {
            items(
                items = data,
                key = { it.id }
            ) { item ->
                FeaturedMovie(
                    item = item
                )
            }
        }
    }
}



@Composable
private fun FeaturedMovie(
    modifier: Modifier = Modifier,
    item: FeaturedMovieState
) {
    Column(
        modifier= modifier.width(224.dp)
    ) {
        Image(
            painter = painterResource(item.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(324.dp)
        )
    }
}