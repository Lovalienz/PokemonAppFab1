package com.poke.pokemonapp.ui.screens.login

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.ui.screens.characters.components.Progressbar
import kotlinx.coroutines.delay

@Composable
fun LoginState(
    onNavigationHome: () ->Unit
){
    val vm: LoginViewModel = hiltViewModel()


    when(val response = vm.loginResponse){
        is Resource.Failure -> {
            Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_SHORT).show()
        }
        Resource.Loading -> {
            Progressbar()
        }
        is Resource.Success -> {
            LaunchedEffect (Unit){
                delay(3500)
                onNavigationHome()
            }
            vm.saveSeason()
            SuccessScreen(
                text = "Login exitoso"
            )
        }
        null -> {

        }
    }
}