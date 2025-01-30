package com.poke.pokemonapp.ui.screens.splash

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SplashViewModel : ViewModel() {
    private val _isVisibleLottie = MutableStateFlow(false)
    val isVisibleLottie: StateFlow<Boolean> = _isVisibleLottie.asStateFlow()

    private val _isVisibleText = MutableStateFlow(false)
    val isVisibleText: StateFlow<Boolean> = _isVisibleText.asStateFlow()

    private val _isVisibleName = MutableStateFlow(false)
    val isVisibleName: StateFlow<Boolean> = _isVisibleName.asStateFlow()


    fun startAnimation(onNavigation: () -> Unit) =
        viewModelScope.launch(Dispatchers.Unconfined) { //tareas livianas
            delay(400)
            _isVisibleName.update { !_isVisibleName.value }
            _isVisibleText.update { !_isVisibleText.value }

            delay(2000)
            _isVisibleText.update { !_isVisibleText.value }
            _isVisibleName.update { !_isVisibleName.value }

            delay(400)
            _isVisibleLottie.update { !_isVisibleLottie.value }

            delay(2700)
            _isVisibleLottie.update { !_isVisibleLottie.value }

            delay(300)
            withContext(Dispatchers.Main) {
                onNavigation()
            }

        }

}
