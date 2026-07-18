package com.kerikir.movietheater.ui.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.kerikir.movietheater.data.MovieThumbnailState
import com.kerikir.movietheater.ui.components.MovieThumbnail
import com.kerikir.movietheater.ui.components.SectionHeader


@Composable
fun HorizontalSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>,
    name: String
) {
    val pageState = rememberPagerState(pageCount = { data.size })

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = name,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        HorizontalPager(
            state = pageState
        ) { pageIndex ->
            MovieThumbnail(
                img = data[pageIndex].img,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}



private val TwoPagesPerViewport = object : PageSize {
    override fun Density.calculateMainAxisPageSize(
        availableSpace: Int,
        pageSpacing: Int
    ): Int {
        return (availableSpace - pageSpacing) / 2
    }
}