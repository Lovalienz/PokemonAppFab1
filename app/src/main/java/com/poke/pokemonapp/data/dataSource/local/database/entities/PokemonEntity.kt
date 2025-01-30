package com.poke.pokemonapp.data.dataSource.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "pokemons")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "pok_name") var name: String,
    @ColumnInfo(name = "pok_front") var frontImage: String,
    @ColumnInfo(name = "pok_back") var backImage: String
)
