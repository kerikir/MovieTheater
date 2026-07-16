package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    }
}



@Composable
private fun FeaturedMovies(
    modifier: Modifier = Modifier,
    item: FeaturedMovieState
) {
    Column(
        modifier= modifier.width(224.dp)
    ) { }
}