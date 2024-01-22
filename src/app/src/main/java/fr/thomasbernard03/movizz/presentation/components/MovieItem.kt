package fr.thomasbernard03.movizz.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import fr.thomasbernard03.movizz.presentation.theme.MovizzTheme


@Composable
fun MovieItem(
    modifier : Modifier = Modifier,
    poster : String
) {
    Card(
        modifier = modifier.then(
            Modifier
                .width(100.dp)
                .height(150.dp)
        )
    ) {
        AsyncImage(
            model = poster,
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
    }
}

@Composable
@Preview
fun MovieItemPreview() {
    MovizzTheme {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                MovieItem(
                    poster = "https://i.ebayimg.com/images/g/og8AAOSwTqFjyvwK/s-l1200.webp"
                )

                MovieItem(
                    poster = "https://i.ebayimg.com/images/g/GtEAAOSw1W9eN1cY/s-l1600.jpg"
                )
            }
        }
    }

}
