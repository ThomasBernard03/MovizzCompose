package fr.thomasbernard03.movizz.data.remote.dto.down

data class BaseDtoDown<T>(
    val page: Int,
    val results: List<T>,
)