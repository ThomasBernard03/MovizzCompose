package fr.thomasbernard03.movizz.presentation.home

import fr.thomasbernard03.movizz.domain.models.Movie

data class HomeUiState(
    val loading : Boolean = false,
    val trendingMovies : List<Movie> = listOf()
)