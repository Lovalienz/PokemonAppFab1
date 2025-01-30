package com.poke.pokemonapp.di

import com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource
import com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSourceImpl
import com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {

    @Provides
    fun providePokemonLocalDataSource(pokemonDao: PokemonDao): PokemonLocalDataSource = PokemonLocalDataSourceImpl(pokemonDao)

}