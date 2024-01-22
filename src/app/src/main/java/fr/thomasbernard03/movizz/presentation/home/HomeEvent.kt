package fr.thomasbernard03.movizz.presentation.home

sealed class HomeEvent {
    data object OnGetTrendingMovies : HomeEvent()
    data object OnRefresh : HomeEvent()
}