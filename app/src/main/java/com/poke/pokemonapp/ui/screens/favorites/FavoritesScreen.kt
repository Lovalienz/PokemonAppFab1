package com.poke.pokemonapp.ui.screens.favorites

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.ui.screens.characters.components.Progressbar
import com.poke.pokemonapp.ui.screens.favorites.components.ListFavorites
import com.poke.pokemonapp.ui.screens.utils.DefaultTopBar

@Composable
fun FavoritesScreen(onBack: () -> Unit){
    DefaultTopBar(
        tittle = "Favoritos",
        content = {
            FavoritesContent()
        },
        onBack = {
            onBack()
        }
    )
}

@Composable
fun FavoritesContent(
    viewModel: FavoritesVieModel = hiltViewModel()
){
when(val response = viewModel.getFavoritesResponse){
    is Resource.Failure -> {
        Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_SHORT).show()
    }
    Resource.Loading -> {
        Progressbar()
    }
    is Resource.Success -> {
        ListFavorites(response.data) { id->
            viewModel.deleteFavorite(id)
        }
    }
    null -> {

    }
}

}