package com.poke.pokemonapp.data.mappers

import com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.domain.model.CharacterModel

fun CharacterModel.toPokemonEntity(): PokemonEntity {
    return PokemonEntity(
        id = this.id,
        name = this.name,
        frontImage = this.sprites.photo,
        backImage = this.sprites.back
    )
}

fun PokemonEntity.toFavoriteDTO(): FavoriteDTO {
    return FavoriteDTO(
        id = this.id.toString(),
        name = this.name,
        frontImageUrl = this.frontImage,
        backImageUrl = this.backImage
    )
}

