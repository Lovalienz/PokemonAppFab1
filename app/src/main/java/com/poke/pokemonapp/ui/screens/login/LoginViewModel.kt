package com.poke.pokemonapp.ui.screens.login

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.model.UserFields
import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authUseCase: FirestoreUseCases,

): ViewModel() {
    var loginResponse by mutableStateOf <Resource<String>?>(null)
    var email : MutableState<String> = mutableStateOf((""))
    var password :MutableState<String> = mutableStateOf((""))

    @SuppressLint("HardwareIds")
    fun login() = viewModelScope.launch(Dispatchers.IO){
        withContext(Dispatchers.Main){
           loginResponse = Resource.Loading
        }

        val userData = UserFields(
            email = email.value,
            password = password.value
        )
        loginResponse = authUseCase.signIn(userData)
  //      Log.i("Login response", loginResponse.toString())

    }
    fun enableLogin(email: String, password: String) =
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 3

    fun saveSeason() = viewModelScope.launch(Dispatchers.Unconfined){
      //  authUseCase.saveSeason(userData)
        Log.w("Season repsonsdf", "se mando")
    }
}