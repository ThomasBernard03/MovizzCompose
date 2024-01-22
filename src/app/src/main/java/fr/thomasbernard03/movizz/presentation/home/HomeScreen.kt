package fr.thomasbernard03.movizz.presentation.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import fr.thomasbernard03.movizz.R
import fr.thomasbernard03.movizz.presentation.components.MovieItem
import fr.thomasbernard03.movizz.presentation.theme.MovizzTheme

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(Unit){
        viewModel.onEvent(HomeEvent.OnGetTrendingMovies)
    }

    Scaffold {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            LazyColumn {
                item {
                    Text(text = stringResource(id = R.string.trending_movies))
                    LazyRow {
                        items(uiState.trendingMovies) { movie ->
                            MovieItem(
                                poster = movie.poster
                            )
                        }
                    }

                }

            }
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun HomeScreenPreview() {
    MovizzTheme {
        Surface {
            val viewModel : HomeViewModel = viewModel()
            HomeScreen(viewModel = viewModel)
        }
    }
}