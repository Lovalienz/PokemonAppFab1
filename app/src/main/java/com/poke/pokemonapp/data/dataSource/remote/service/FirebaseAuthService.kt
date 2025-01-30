package com.poke.pokemonapp.data.dataSource.remote.service

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.poke.pokemonapp.core.Resource
import kotlinx.coroutines.tasks.await
import javax.inject.Inject



class FirebaseAuthService @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {
    suspend fun signIn(email: String, password: String): Resource<String> {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val user = result.user
            if (user != null) {
                Resource.Success("Login exitoso")
            } else {
                Resource.Failure("Authentication failed")
            }
        } catch (e: Exception) {
            Resource.Failure(e.localizedMessage ?: "Error during sign-in")
        }
    }

    suspend fun signUp(email: String, password: String): Resource<String> {
        return try {
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            val user = result.user
            Log.i("registrationjsjs", "${user?.email}")
            if (user != null) {
                Resource.Success("Usuario registrado exitosamente")
            } else {
                Resource.Failure("User registration failed")
            }
        } catch (e: Exception) {
            Resource.Failure(e.localizedMessage ?: "Error during sign-up")
        }
    }

    suspend fun signOut() {
        firebaseAuth.signOut()
    }

    fun getCurrentUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }
}
