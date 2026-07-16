package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kerikir.movietheater.data.FeaturedMoviesState
import com.kerikir.movietheater.ui.components.SectionHeader


@Composable
fun FeatureMoviesSection(
    modifier: Modifier = Modifier,
    data: List<FeaturedMoviesState>
) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            text = "Featured Movies"
        )
    }
}