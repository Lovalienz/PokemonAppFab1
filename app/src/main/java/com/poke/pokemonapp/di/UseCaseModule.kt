package com.poke.pokemonapp.di

import com.poke.pokemonapp.domain.repositories.FirebaseRepository
import com.poke.pokemonapp.domain.repositories.PokemonRepository
import com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase
import com.poke.pokemonapp.domain.useCases.pokemonsUseCases.GetAllCharactersUseCase
import com.poke.pokemonapp.domain.useCases.pokemonsUseCases.PokemonUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun providePokemonUseCase(pokemonRepository: PokemonRepository) = PokemonUseCase(
        getAllCharacter = GetAllCharactersUseCase(pokemonRepository)
    )

    @Provides
    fun provideFirebaseFirestoreUseCases(fireStoreRepository: FirebaseRepository) = FirestoreUseCases(
        addFavorite = AddFavoriteUseCase(fireStoreRepository),
        getFavorites = GetFavoritesUseCase(fireStoreRepository),
        deleteFavorite = DeleteFavoriteUseCase(fireStoreRepository),
        signIn = SignInUseCase(fireStoreRepository),
        signUp = SignUpUseCase(fireStoreRepository)
            )

}