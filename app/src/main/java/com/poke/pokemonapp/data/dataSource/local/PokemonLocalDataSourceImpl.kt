package com.poke.pokemonapp.data.dataSource.local

import com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao
import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity
import javax.inject.Inject

class PokemonLocalDataSourceImpl @Inject constructor(private val pokemonDao: PokemonDao): PokemonLocalDataSource {
    override suspend fun insert(pokemon: PokemonEntity):Long {
       return pokemonDao.insert(pokemon)
    }

    override suspend fun insertAll(pokemons: List<PokemonEntity>) {
        pokemonDao.insertAll(pokemons)
    }

    override suspend fun getAll(): List<PokemonEntity> {
        return pokemonDao.getAll()
    }

    override suspend fun delete(id: String) {
        return pokemonDao.delete(id)
    }

    override suspend fun deleteAll() {
        return pokemonDao.deleteAll()
    }

    override suspend fun getById(id: Long): PokemonEntity {
        return pokemonDao.getById(id)
    }

}