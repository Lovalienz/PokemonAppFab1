package com.poke.pokemonapp.data.dataSource.remote.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/remote/service/PokeApiService;", "", "getCharacterInfo", "Lcom/poke/pokemonapp/domain/model/CharacterModel;", "urlCharacter", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "Lcom/poke/pokemonapp/domain/model/GetAllCharacterResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PokeApiService {
    
    @retrofit2.http.GET(value = "pokemon")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacters(@retrofit2.http.Query(value = "offset")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.domain.model.GetAllCharacterResponse> $completion);
    
    @retrofit2.http.GET(value = "{url}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacterInfo(@retrofit2.http.Path(value = "url")
    @org.jetbrains.annotations.NotNull()
    java.lang.String urlCharacter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.domain.model.CharacterModel> $completion);
}