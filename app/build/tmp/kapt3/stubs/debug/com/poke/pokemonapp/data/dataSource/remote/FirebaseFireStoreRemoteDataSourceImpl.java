package com.poke.pokemonapp.data.dataSource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\bH\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/remote/FirebaseFireStoreRemoteDataSourceImpl;", "Lcom/poke/pokemonapp/data/dataSource/remote/FirebaseRemoteDataSource;", "service", "Lcom/poke/pokemonapp/data/dataSource/remote/service/FireStoreService;", "authService", "Lcom/poke/pokemonapp/data/dataSource/remote/service/FirebaseAuthService;", "(Lcom/poke/pokemonapp/data/dataSource/remote/service/FireStoreService;Lcom/poke/pokemonapp/data/dataSource/remote/service/FirebaseAuthService;)V", "addFavoriteToFireStore", "Lcom/poke/pokemonapp/core/Resource;", "", "favorite", "Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;", "(Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteFromFireStore", "favoriteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoritesFromFireStore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "userFields", "Lcom/poke/pokemonapp/domain/model/UserFields;", "(Lcom/poke/pokemonapp/domain/model/UserFields;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "app_debug"})
public final class FirebaseFireStoreRemoteDataSourceImpl implements com.poke.pokemonapp.data.dataSource.remote.FirebaseRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService service = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService authService = null;
    
    @javax.inject.Inject()
    public FirebaseFireStoreRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService service, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService authService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addFavoriteToFireStore(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getFavoritesFromFireStore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<? extends java.util.List<com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteFavoriteFromFireStore(@org.jetbrains.annotations.NotNull()
    java.lang.String favoriteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.model.UserFields userFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.model.UserFields userFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.core.Resource<java.lang.String>> $completion) {
        return null;
    }
}