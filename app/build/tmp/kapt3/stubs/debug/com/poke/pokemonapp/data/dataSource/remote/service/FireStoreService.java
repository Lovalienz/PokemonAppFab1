package com.poke.pokemonapp.data.dataSource.remote.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\bH\u0086@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/remote/service/FireStoreService;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "favoritesCollection", "Lcom/google/firebase/firestore/CollectionReference;", "addFavoriteToFirestore", "Lcom/poke/pokemonapp/core/Resource;", "", "favorite", "Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;", "(Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteFromFirestore", "favoriteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoritesFromFirestore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FireStoreService {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.CollectionReference favoritesCollection = null;
    
    public FireStoreService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavoriteToFirestore(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFavoritesFromFirestore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<? extends java.util.List<com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavoriteFromFirestore(@org.jetbrains.annotations.NotNull()
    java.lang.String favoriteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
}