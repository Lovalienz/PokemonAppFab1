package com.poke.pokemonapp.data.dataSource.local

import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity

interface PokemonLocalDataSource {
    suspend fun insert(pokemon: PokemonEntity):Long
    suspend fun insertAll(pokemons: List<PokemonEntity>)
    suspend fun getAll(): List<PokemonEntity>
    suspend fun delete(id: String)
    suspend fun deleteAll()
    suspend fun getById(id: Long): PokemonEntity
}
