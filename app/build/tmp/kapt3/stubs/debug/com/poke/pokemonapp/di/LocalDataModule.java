package com.poke.pokemonapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/poke/pokemonapp/di/LocalDataModule;", "", "()V", "providePokemonLocalDataSource", "Lcom/poke/pokemonapp/data/dataSource/local/PokemonLocalDataSource;", "pokemonDao", "Lcom/poke/pokemonapp/data/dataSource/local/database/dao/PokemonDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class LocalDataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.di.LocalDataModule INSTANCE = null;
    
    private LocalDataModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource providePokemonLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao pokemonDao) {
        return null;
    }
}