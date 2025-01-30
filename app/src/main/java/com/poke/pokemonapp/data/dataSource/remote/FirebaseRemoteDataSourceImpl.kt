package com.poke.pokemonapp.data.dataSource.remote

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService
import com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService
import com.poke.pokemonapp.domain.model.UserFields
import javax.inject.Inject

class FirebaseFireStoreRemoteDataSourceImpl @Inject constructor(
    private val service: FireStoreService,
    private val authService: FirebaseAuthService
): FirebaseRemoteDataSource{
    override suspend fun addFavoriteToFireStore(favorite: FavoriteDTO): Resource<String> {
        return service.addFavoriteToFirestore(favorite)
    }

    override suspend fun getFavoritesFromFireStore(): Resource<List<FavoriteDTO>> {
        return service.getFavoritesFromFirestore()
    }

    override suspend fun deleteFavoriteFromFireStore(favoriteId: String): Resource<String> {
        return service.deleteFavoriteFromFirestore(favoriteId)
    }

    override suspend fun signIn(userFields: UserFields): Resource<String> {
        return authService.signIn(userFields.email, userFields.password)
    }

    override suspend fun signUp(userFields: UserFields): Resource<String> {
        return authService.signUp(userFields.email, userFields.password)
    }
}