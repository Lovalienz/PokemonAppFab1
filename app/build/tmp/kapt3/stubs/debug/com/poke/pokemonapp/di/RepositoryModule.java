package com.poke.pokemonapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/poke/pokemonapp/di/RepositoryModule;", "", "()V", "provideFirebaseFireStoreRepository", "Lcom/poke/pokemonapp/domain/repositories/FirebaseRepository;", "remoteDataSource", "Lcom/poke/pokemonapp/data/dataSource/remote/FirebaseRemoteDataSource;", "localDataSource", "Lcom/poke/pokemonapp/data/dataSource/local/PokemonLocalDataSource;", "providePokemonRepository", "Lcom/poke/pokemonapp/domain/repositories/PokemonRepository;", "dataSource", "Lcom/poke/pokemonapp/data/dataSource/remote/PokemonRemoteDataSourceImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.repositories.PokemonRepository providePokemonRepository(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.PokemonRemoteDataSourceImpl dataSource) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.repositories.FirebaseRepository provideFirebaseFireStoreRepository(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource localDataSource) {
        return null;
    }
}