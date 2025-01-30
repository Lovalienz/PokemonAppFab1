package com.poke.pokemonapp.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/poke/pokemonapp/core/Config;", "", "()V", "BASE_URL", "", "pokemonInfo", "", "Lcom/poke/pokemonapp/domain/model/CharacterModel;", "getPokemonInfo", "()Ljava/util/List;", "setPokemonInfo", "(Ljava/util/List;)V", "app_debug"})
public final class Config {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://pokeapi.co/api/v2/";
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.poke.pokemonapp.domain.model.CharacterModel> pokemonInfo;
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.core.Config INSTANCE = null;
    
    private Config() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.poke.pokemonapp.domain.model.CharacterModel> getPokemonInfo() {
        return null;
    }
    
    public final void setPokemonInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<com.poke.pokemonapp.domain.model.CharacterModel> p0) {
    }
}