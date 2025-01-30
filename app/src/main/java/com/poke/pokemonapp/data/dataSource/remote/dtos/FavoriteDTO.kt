package com.poke.pokemonapp.data.dataSource.remote.dtos

import com.google.firebase.firestore.PropertyName

data class FavoriteDTO(
   @PropertyName("id") val id: String = "",
   @PropertyName("name") val name: String = "",
   @PropertyName("frontImageUrl") val frontImageUrl: String = "",
   @PropertyName("backImageUrl") val backImageUrl: String = ""
)

