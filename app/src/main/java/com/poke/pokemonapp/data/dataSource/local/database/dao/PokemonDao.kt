package com.poke.pokemonapp.data.dataSource.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity

@Dao
interface PokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(pokemon: PokemonEntity):Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(pokemons:List<PokemonEntity>)

    @Query("SELECT * FROM pokemons ")
    fun getAll():List<PokemonEntity>

    @Query("DELETE FROM pokemons  WHERE id = :id")
    suspend fun delete(id: String)

    @Query("DELETE FROM pokemons")
    fun deleteAll()
    @Query("SELECT * FROM pokemons WHERE id = :id")
    suspend fun getById(id: Long): PokemonEntity

}