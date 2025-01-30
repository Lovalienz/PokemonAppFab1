package com.poke.pokemonapp.di

import com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource
import com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource
import com.poke.pokemonapp.data.dataSource.remote.PokemonRemoteDataSourceImpl
import com.poke.pokemonapp.data.repositoryImpl.FirebaseRepositoryImpl
import com.poke.pokemonapp.data.repositoryImpl.PokemonRepositoryImpl
import com.poke.pokemonapp.domain.repositories.FirebaseRepository
import com.poke.pokemonapp.domain.repositories.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun providePokemonRepository(dataSource: PokemonRemoteDataSourceImpl): PokemonRepository =
        PokemonRepositoryImpl(dataSource)

    @Provides
    fun provideFirebaseFireStoreRepository(
        remoteDataSource: FirebaseRemoteDataSource,
        localDataSource: PokemonLocalDataSource
    ): FirebaseRepository =
        FirebaseRepositoryImpl(remoteDataSource, localDataSource)


}