package fr.thomasbernard03.movizz.data.remote.dto.down

import com.google.gson.annotations.SerializedName

data class MovieDtoDown(
    @SerializedName("id")
    val id : Int,

    @SerializedName("title")
    val title : String,

    @SerializedName("posterPath")
    val posterPath : String,
)