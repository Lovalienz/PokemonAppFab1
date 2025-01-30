package com.poke.pokemonapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/poke/pokemonapp/di/FirebaseModule;", "", "()V", "provideAuthService", "Lcom/poke/pokemonapp/data/dataSource/remote/service/FirebaseAuthService;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFireStoreService", "Lcom/poke/pokemonapp/data/dataSource/remote/service/FireStoreService;", "provideFirebaseAuth", "provideFirebaseRemoteDataSource", "Lcom/poke/pokemonapp/data/dataSource/remote/FirebaseRemoteDataSource;", "fireStoreService", "authService", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class FirebaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.di.FirebaseModule INSTANCE = null;
    
    private FirebaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService provideFireStoreService() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService provideAuthService(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource provideFirebaseRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService fireStoreService, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService authService) {
        return null;
    }
}