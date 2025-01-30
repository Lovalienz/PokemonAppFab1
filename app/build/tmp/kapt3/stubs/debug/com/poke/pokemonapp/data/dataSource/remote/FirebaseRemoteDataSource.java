package com.poke.pokemonapp.data.dataSource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/remote/FirebaseRemoteDataSource;", "", "addFavoriteToFireStore", "Lcom/poke/pokemonapp/core/Resource;", "", "favorite", "Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;", "(Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteFromFireStore", "favoriteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoritesFromFireStore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "userFields", "Lcom/poke/pokemonapp/domain/model/UserFields;", "(Lcom/poke/pokemonapp/domain/model/UserFields;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "app_debug"})
public abstract interface FirebaseRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addFavoriteToFireStore(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavoritesFromFireStore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<? extends java.util.List<com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteFavoriteFromFireStore(@org.jetbrains.annotations.NotNull()
    java.lang.String favoriteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.model.UserFields userFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.model.UserFields userFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion);
}