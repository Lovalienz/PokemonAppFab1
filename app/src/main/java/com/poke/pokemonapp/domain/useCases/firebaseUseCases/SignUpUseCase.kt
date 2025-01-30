package com.poke.pokemonapp.domain.useCases.firebaseUseCases


import com.google.firebase.firestore.auth.User
import com.poke.pokemonapp.core.Resource
import com.poke.pokemonapp.domain.model.UserFields
import com.poke.pokemonapp.domain.repositories.FirebaseRepository

class SignUpUseCase(private val repository: FirebaseRepository) {
    suspend operator fun invoke(userFields: UserFields): Resource<String> {
        return repository.signUp(userFields)
    }
}