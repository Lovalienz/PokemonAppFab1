package com.poke.pokemonapp.data.repositoryImpl

import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource
import com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.data.mappers.toFavoriteDTO
import com.poke.pokemonapp.data.mappers.toPokemonEntity
import com.poke.pokemonapp.domain.model.CharacterModel
import com.poke.pokemonapp.domain.model.UserFields
import com.poke.pokemonapp.domain.repositories.FirebaseRepository
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor(
    private val remoteDataSource: FirebaseRemoteDataSource,
    private val localDataSource: PokemonLocalDataSource
) : FirebaseRepository {

    override suspend fun addFavoriteToFireStore(favorite: CharacterModel): Resource<String> {
        val id = localDataSource.insert(favorite.toPokemonEntity())
        val registeredPokemon = localDataSource.getById(id)
        val lastPokemon = registeredPokemon
        val pokemonDto = FavoriteDTO(
            id = lastPokemon.id.toString(),
            name = lastPokemon.name,
            frontImageUrl = lastPokemon.frontImage,
            backImageUrl = lastPokemon.backImage
        )

        return remoteDataSource.addFavoriteToFireStore(pokemonDto)
    }

    override suspend fun getFavoritesFromFireStore(): Resource<List<FavoriteDTO>> {
        val response = remoteDataSource.getFavoritesFromFireStore()
        return if (response is Resource.Success) {
            response
        } else {
            val localPokemons = localDataSource.getAll()
            val pokemonParsedList: MutableList<FavoriteDTO> = mutableListOf()
            localPokemons.forEach(){
               pokemonParsedList.add(it.toFavoriteDTO())
            }
            Resource.Success(pokemonParsedList)
        }

    }

    override suspend fun deleteFavoriteFromFireStore(favoriteId: String): Resource<String> {
        val response = remoteDataSource.deleteFavoriteFromFireStore(favoriteId)
        return if (response is Resource.Success) {
            localDataSource.delete(favoriteId)
            response
        } else {
            response
        }
    }

    override suspend fun signIn(userFields: UserFields): Resource<String> {
        return remoteDataSource.signIn(userFields)
    }

    override suspend fun signUp(userFields: UserFields): Resource<String> {
        return remoteDataSource.signUp(userFields)
    }
}