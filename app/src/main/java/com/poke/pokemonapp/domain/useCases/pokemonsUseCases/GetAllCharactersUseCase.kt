package com.poke.pokemonapp.domain.useCases.pokemonsUseCases

import com.poke.pokemonapp.domain.repositories.PokemonRepository

class GetAllCharactersUseCase constructor(private val repository: PokemonRepository) {

    suspend operator fun invoke() = repository.getAlCharacters()
}