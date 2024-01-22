package fr.thomasbernard03.movizz.domain.usecases

import fr.thomasbernard03.movizz.domain.models.Movie

class MovieUseCase {

    suspend fun getTrendingMovies() : List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "The last of us",
                poster = "https://i.ebayimg.com/images/g/og8AAOSwTqFjyvwK/s-l1200.webp"
            ),
            Movie(
                id = 2,
                title = "1917",
                poster = "https://i.ebayimg.com/images/g/GtEAAOSw1W9eN1cY/s-l1600.jpg"
            )
        )
    }
}