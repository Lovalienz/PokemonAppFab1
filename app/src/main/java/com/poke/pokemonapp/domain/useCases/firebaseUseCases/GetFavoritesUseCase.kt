package com.poke.pokemonapp.domain.useCases.firebaseUseCases

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.domain.repositories.FirebaseRepository

class GetFavoritesUseCase(private val repository: FirebaseRepository) {
    suspend operator fun invoke(): Resource<List<FavoriteDTO>> {
        return repository.getFavoritesFromFireStore()
    }
}
