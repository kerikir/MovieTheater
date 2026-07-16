package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.MovieThumbnailState
import com.kerikir.movietheater.ui.components.SectionHeader


@Composable
fun ComingSoonSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = "Coming Soon"
        )
    }
}