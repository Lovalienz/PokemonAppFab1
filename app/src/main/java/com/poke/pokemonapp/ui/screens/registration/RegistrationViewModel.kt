package com.poke.pokemonapp.ui.screens.registration

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.model.UserFields
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases
import kotlinx.coroutines.delay

@HiltViewModel
class RegisterViewModel @Inject constructor(private val authUseCase: FirestoreUseCases): ViewModel() {
    var email : MutableState<String> = mutableStateOf((""))
    var name : MutableState<String> = mutableStateOf((""))
    var lastname : MutableState<String> = mutableStateOf((""))
    var password : MutableState<String> = mutableStateOf((""))
    var newPassword : MutableState<String> = mutableStateOf((""))
    var registerResponse by mutableStateOf <Resource<String>?>(null)


    fun register() = viewModelScope.launch(Dispatchers.IO) {
        withContext(Dispatchers.Main){
            registerResponse = Resource.Loading
        }
        val userData = UserFields(email = email.value, password.value)
        Log.i("registrarionjsjs", "$userData")
        delay(3000)
        registerResponse = authUseCase.signUp(userData)


    }

    fun enableRegister() =
        Patterns.EMAIL_ADDRESS.matcher(email.value).matches() && name.value != "" && lastname.value != "" && isPasswordOk()

    fun isPasswordOk() = password.value == newPassword.value && password.value != "" && newPassword.value != ""
}