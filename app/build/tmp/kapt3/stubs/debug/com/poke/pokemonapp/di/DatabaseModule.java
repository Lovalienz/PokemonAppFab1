package com.poke.pokemonapp.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/poke/pokemonapp/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/poke/pokemonapp/data/dataSource/local/database/PokemonDB;", "app", "Landroid/app/Application;", "providePokemonDao", "Lcom/poke/pokemonapp/data/dataSource/local/database/dao/PokemonDao;", "db", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.local.database.PokemonDB provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao providePokemonDao(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.database.PokemonDB db) {
        return null;
    }
}