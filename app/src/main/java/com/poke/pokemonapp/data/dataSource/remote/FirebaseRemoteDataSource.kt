package com.poke.pokemonapp.data.dataSource.remote

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.domain.model.UserFields

interface FirebaseRemoteDataSource {
    suspend fun addFavoriteToFireStore(favorite: FavoriteDTO): Resource<String>
    suspend fun getFavoritesFromFireStore(): Resource<List<FavoriteDTO>>
    suspend fun deleteFavoriteFromFireStore(favoriteId: String): Resource<String>
    suspend fun signIn(userFields: UserFields): Resource<String>
    suspend fun signUp(userFields: UserFields): Resource<String>


}
