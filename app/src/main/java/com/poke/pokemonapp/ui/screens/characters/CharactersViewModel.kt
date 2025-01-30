package com.poke.pokemonapp.ui.screens.characters

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.model.CharacterModel
import com.poke.pokemonapp.domain.model.Pokemon
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases
import com.poke.pokemonapp.domain.useCases.pokemonsUseCases.PokemonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val pokemonUseCase: PokemonUseCase,
    private val firestoreUseCases: FirestoreUseCases
) : ViewModel() {

    private val _characters = MutableStateFlow<PagingData<Pokemon>>(PagingData.empty())
    val characters: StateFlow<PagingData<Pokemon>> = _characters.asStateFlow()
    var addFavoriteResponse by mutableStateOf<Resource<String>?>(null)

    init {
        getAllCharacters()
    }

    private fun getAllCharacters() {
        viewModelScope.launch {
            pokemonUseCase.getAllCharacter()
                .cachedIn(viewModelScope) // Caching para evitar recargas innecesarias
                .collectLatest { pagingData ->
                    _characters.value = pagingData
                }
        }
    }
    fun setFavorite(pokemonInfo: CharacterModel) = viewModelScope.launch(Dispatchers.IO) {
        withContext(Dispatchers.Main){
            addFavoriteResponse = Resource.Loading
        }
        Log.d("PokemonAddesxd", pokemonInfo.toString())
        addFavoriteResponse = firestoreUseCases.addFavorite(pokemonInfo)
    }
}
