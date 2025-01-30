package com.poke.pokemonapp.di

import com.google.firebase.auth.FirebaseAuth
import com.poke.pokemonapp.data.dataSource.remote.FirebaseFireStoreRemoteDataSourceImpl
import com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource
import com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService
import com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {

    @Provides
    @Singleton
    fun provideFireStoreService(): FireStoreService {
        return FireStoreService()
    }
    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }
    @Provides
    @Singleton
    fun provideAuthService(firebaseAuth: FirebaseAuth): FirebaseAuthService {
        return FirebaseAuthService(firebaseAuth)
    }


    @Provides
    @Singleton
    fun provideFirebaseRemoteDataSource(
        fireStoreService: FireStoreService,
        authService: FirebaseAuthService
    ): FirebaseRemoteDataSource {
        return FirebaseFireStoreRemoteDataSourceImpl(fireStoreService, authService)
    }
}
