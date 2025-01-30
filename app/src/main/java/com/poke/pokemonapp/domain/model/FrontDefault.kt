package com.poke.pokemonapp.domain.model

import com.google.gson.annotations.SerializedName

data class FrontDefault(
    @SerializedName("front_default") val photo: String,
    @SerializedName("back_default") val back: String
)
