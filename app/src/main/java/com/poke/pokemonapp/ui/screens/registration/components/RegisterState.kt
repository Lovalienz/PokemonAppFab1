package com.poke.pokemonapp.ui.screens.registration.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.ui.screens.characters.components.Progressbar
import com.poke.pokemonapp.ui.screens.registration.RegisterViewModel


@Composable
fun RegisterState(){
    val vm: RegisterViewModel = hiltViewModel()
    val context = LocalContext.current
    when(val response = vm.registerResponse){
        is Resource.Failure -> {
            Toast.makeText(context, response.message, Toast.LENGTH_LONG).show()
        }
        Resource.Loading -> {
            Progressbar()
        }
        is Resource.Success<*> -> {
            Toast.makeText(context, "Success", Toast.LENGTH_LONG).show()
        }
        null -> {}
    }
}