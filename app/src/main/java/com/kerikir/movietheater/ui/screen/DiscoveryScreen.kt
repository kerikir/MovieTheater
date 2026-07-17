package com.kerikir.movietheater.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.DiscoverScreenState
import com.kerikir.movietheater.ui.components.section.ComingSoonSection
import com.kerikir.movietheater.ui.components.section.FeatureMoviesSection


@Composable
fun DiscoveryScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollableState),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        FeatureMoviesSection(
            data = screenState.featureMovies
        )
        ComingSoonSection(
            data = screenState.upcomingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
    }
}