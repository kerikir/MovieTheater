package com.kerikir.movietheater.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.DiscoverScreenState
import com.kerikir.movietheater.ui.components.section.FeatureMoviesSection


@Composable
fun DiscoveryScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        FeatureMoviesSection(
            data = screenState.featureMovies
        )
    }
}