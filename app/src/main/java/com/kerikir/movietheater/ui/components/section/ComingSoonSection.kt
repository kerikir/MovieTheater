package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.MovieThumbnailState
import com.kerikir.movietheater.ui.components.MovieThumbnail
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
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            maxItemsInEachRow = 2
        ) {
            data.onEach { thumbnail ->
                MovieThumbnail(
                    img = thumbnail.img,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}