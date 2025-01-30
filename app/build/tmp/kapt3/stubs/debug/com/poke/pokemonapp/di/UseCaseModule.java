package com.poke.pokemonapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/poke/pokemonapp/di/UseCaseModule;", "", "()V", "provideFirebaseFirestoreUseCases", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;", "fireStoreRepository", "Lcom/poke/pokemonapp/domain/repositories/FirebaseRepository;", "providePokemonUseCase", "Lcom/poke/pokemonapp/domain/useCases/pokemonsUseCases/PokemonUseCase;", "pokemonRepository", "Lcom/poke/pokemonapp/domain/repositories/PokemonRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.pokemonsUseCases.PokemonUseCase providePokemonUseCase(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.repositories.PokemonRepository pokemonRepository) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases provideFirebaseFirestoreUseCases(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.repositories.FirebaseRepository fireStoreRepository) {
        return null;
    }
}