package com.poke.pokemonapp.domain.useCases.firebaseUseCases

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.model.CharacterModel
import com.poke.pokemonapp.domain.repositories.FirebaseRepository


class AddFavoriteUseCase(private val repository: FirebaseRepository) {
    suspend operator fun invoke(favorite: CharacterModel): Resource<String> {
        return repository.addFavoriteToFireStore(favorite)
    }
}