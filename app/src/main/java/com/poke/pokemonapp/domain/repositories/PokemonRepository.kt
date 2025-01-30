package com.poke.pokemonapp.domain.repositories

import androidx.paging.PagingData
import com.poke.pokemonapp.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

   suspend fun getAlCharacters(): Flow<PagingData<Pokemon>>

}