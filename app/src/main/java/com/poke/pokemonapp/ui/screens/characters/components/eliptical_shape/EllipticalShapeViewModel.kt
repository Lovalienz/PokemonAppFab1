package com.poke.pokemonapp.ui.screens.characters.components.eliptical_shape

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class EllipticalViewModel : ViewModel() {
    var screenHeight by mutableIntStateOf(0)
    // UI State
    private val _showCircle = MutableStateFlow(false)
    val showCircle: StateFlow<Boolean> = _showCircle

    private val _showComponents = MutableStateFlow(false)
    val showComponents: StateFlow<Boolean> = _showComponents

    private val _progress = MutableStateFlow(0f)
    val progress: StateFlow<Float> = _progress

    private val _repeatCount = MutableStateFlow(0)
    val repeatCount: StateFlow<Int> = _repeatCount

    private val _isAnimating = MutableStateFlow(true)
    val isAnimating: StateFlow<Boolean> = _isAnimating

    init {
        startAnimation()
    }

    private fun startAnimation() {
        viewModelScope.launch {
            delay(200)
            _showCircle.value = true
            delay(400)
            _showComponents.value = true
        }
    }

    fun updateProgress(offset: Float) {
        _progress.value = if (offset < 0.65f) 0f else 1f
    }

    fun toggleAnimation() {
        if (_repeatCount.value < 2) {
            viewModelScope.launch {
                delay(600)
                _isAnimating.value = !_isAnimating.value
                _repeatCount.value += 1
            }
        }
    }
}
