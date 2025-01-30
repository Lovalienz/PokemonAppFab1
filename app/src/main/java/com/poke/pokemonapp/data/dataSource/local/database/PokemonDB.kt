package com.poke.pokemonapp.data.dataSource.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao
import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity

@Database(
    entities = [PokemonEntity::class],
    version = 1,
    exportSchema = false
)

abstract class PokemonDB : RoomDatabase(){

    abstract fun pokemonDao (): PokemonDao

    companion object {
        @Volatile
        private var Instance: PokemonDB? = null
        fun getDatabase(context: Context): PokemonDB {

            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, PokemonDB::class.java, "pokemon_db")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}

