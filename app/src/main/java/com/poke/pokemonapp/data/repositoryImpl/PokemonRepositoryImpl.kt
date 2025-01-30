package com.poke.pokemonapp.data.repositoryImpl

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.poke.pokemonapp.data.dataSource.remote.PokemonRemoteDataSourceImpl
import com.poke.pokemonapp.domain.model.Pokemon
import com.poke.pokemonapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

class PokemonRepositoryImpl(private val remoteDataSource: PokemonRemoteDataSourceImpl): PokemonRepository {
    companion object{
        const val MAX_ITEMS = 10
        const val PREFETCH_ITEMS = 5
    }
    override suspend fun getAlCharacters(): Flow<PagingData<Pokemon>> {

        return Pager(config = PagingConfig(pageSize = MAX_ITEMS, prefetchDistance = PREFETCH_ITEMS),
            pagingSourceFactory = {
                remoteDataSource
            }).flow
    }
}