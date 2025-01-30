package com.poke.pokemonapp.domain.useCases.firebaseUseCases

import com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase

data class FirestoreUseCases(
    val addFavorite: AddFavoriteUseCase,
    val getFavorites: GetFavoritesUseCase,
    val deleteFavorite: DeleteFavoriteUseCase,
    val signIn: SignInUseCase,
    val signUp: SignUpUseCase
)
