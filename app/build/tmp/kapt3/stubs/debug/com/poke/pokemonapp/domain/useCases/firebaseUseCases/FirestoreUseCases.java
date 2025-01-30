package com.poke.pokemonapp.domain.useCases.firebaseUseCases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;", "", "addFavorite", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/AddFavoriteUseCase;", "getFavorites", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/GetFavoritesUseCase;", "deleteFavorite", "Lcom/poke/pokemonapp/domain/useCases/fireStoreUseCases/DeleteFavoriteUseCase;", "signIn", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignInUseCase;", "signUp", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignUpUseCase;", "(Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/AddFavoriteUseCase;Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/GetFavoritesUseCase;Lcom/poke/pokemonapp/domain/useCases/fireStoreUseCases/DeleteFavoriteUseCase;Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignInUseCase;Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignUpUseCase;)V", "getAddFavorite", "()Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/AddFavoriteUseCase;", "getDeleteFavorite", "()Lcom/poke/pokemonapp/domain/useCases/fireStoreUseCases/DeleteFavoriteUseCase;", "getGetFavorites", "()Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/GetFavoritesUseCase;", "getSignIn", "()Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignInUseCase;", "getSignUp", "()Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/SignUpUseCase;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class FirestoreUseCases {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase addFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase getFavorites = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase deleteFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase signIn = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase signUp = null;
    
    public FirestoreUseCases(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase addFavorite, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase getFavorites, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase deleteFavorite, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase signIn, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase signUp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase getAddFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase getGetFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase getDeleteFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase getSignIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase getSignUp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases copy(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.AddFavoriteUseCase addFavorite, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.GetFavoritesUseCase getFavorites, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.fireStoreUseCases.DeleteFavoriteUseCase deleteFavorite, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignInUseCase signIn, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.SignUpUseCase signUp) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}