package com.poke.pokemonapp.di

import android.app.Application
import androidx.room.Room
import com.poke.pokemonapp.data.dataSource.local.database.PokemonDB
import com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(app: Application): PokemonDB =
        Room.databaseBuilder(app,PokemonDB::class.java,"pokemon_db").fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun providePokemonDao(db: PokemonDB):PokemonDao = db.pokemonDao()


}