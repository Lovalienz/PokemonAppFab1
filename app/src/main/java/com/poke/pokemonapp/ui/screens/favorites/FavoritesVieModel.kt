package com.poke.pokemonapp.ui.screens.favorites

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class FavoritesVieModel @Inject constructor(private val firebaseUseCases: FirestoreUseCases): ViewModel() {

    var getFavoritesResponse by mutableStateOf <Resource<List<FavoriteDTO>>?>(null)
    var deleteFavoriteResponse by mutableStateOf <Resource<String>?>(null)

    init {
        getFavorites()
    }

    private fun getFavorites() = viewModelScope.launch(Dispatchers.IO) {
        withContext(Dispatchers.Main){
            getFavoritesResponse = Resource.Loading
        }
        getFavoritesResponse = firebaseUseCases.getFavorites()
    }

    fun deleteFavorite(pokemonId:String) = viewModelScope.launch(Dispatchers.IO) {
        withContext(Dispatchers.Main){
            deleteFavoriteResponse = Resource.Loading
        }
        deleteFavoriteResponse = firebaseUseCases.deleteFavorite(pokemonId)
    }

}