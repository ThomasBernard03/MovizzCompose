package fr.thomasbernard03.movizz.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.thomasbernard03.movizz.domain.usecases.MovieUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.get

class HomeViewModel(
    private val movieUseCase: MovieUseCase = get(MovieUseCase::class.java),
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun onEvent(event: HomeEvent) {
        when (event) {
            HomeEvent.OnRefresh -> TODO()
            HomeEvent.OnGetTrendingMovies -> onGetTrendingMovies()
        }
    }

    private fun onGetTrendingMovies(){
        viewModelScope.launch {
            val trendingMovies = movieUseCase.getTrendingMovies()
            _uiState.update { it.copy(trendingMovies = trendingMovies) }
        }
    }
}