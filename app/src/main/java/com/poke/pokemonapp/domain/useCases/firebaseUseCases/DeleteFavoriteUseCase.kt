package com.poke.pokemonapp.domain.useCases.fireStoreUseCases

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.repositories.FirebaseRepository

class DeleteFavoriteUseCase(private val repository: FirebaseRepository) {
    suspend operator fun invoke(favoriteId: String): Resource<String> {
        return repository.deleteFavoriteFromFireStore(favoriteId)
    }
}