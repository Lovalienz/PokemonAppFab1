package com.poke.pokemonapp.ui.screens.characters.components

import android.graphics.Color
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.ui.screens.characters.CharactersViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AddFavoriteState(
    vm: CharactersViewModel = hiltViewModel()
){
    val context = LocalContext.current
    when (val response = vm.addFavoriteResponse) {
        is Resource.Loading -> {
            Progressbar()
        }

        is Resource.Success -> {
           Toast.makeText(context, response.data, Toast.LENGTH_SHORT).show()
            vm.addFavoriteResponse = null
        }

        is Resource.Failure -> {
            Toast.makeText(context, response.message, Toast.LENGTH_SHORT).show()
            vm.addFavoriteResponse = null
        }

        else -> {

        }
    }
}