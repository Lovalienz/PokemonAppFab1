package com.poke.pokemonapp.core


sealed class Resource<out T>{

    data object Loading: Resource<Nothing>()
    data class Success<out T>(val data :T): Resource<T>()
    data class Failure(val message :String): Resource<Nothing>()

}