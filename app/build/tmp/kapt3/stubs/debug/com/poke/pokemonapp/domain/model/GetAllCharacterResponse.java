package com.poke.pokemonapp.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003JB\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/poke/pokemonapp/domain/model/GetAllCharacterResponse;", "", "currentPage", "", "nextPage", "", "previousPage", "pokemonResults", "", "Lcom/poke/pokemonapp/domain/model/Pokemon;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextPage", "()Ljava/lang/String;", "getPokemonResults", "()Ljava/util/List;", "getPreviousPage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/poke/pokemonapp/domain/model/GetAllCharacterResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class GetAllCharacterResponse {
    @com.google.gson.annotations.SerializedName(value = "count")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer currentPage = null;
    @com.google.gson.annotations.SerializedName(value = "next")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nextPage = null;
    @com.google.gson.annotations.SerializedName(value = "previous")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String previousPage = null;
    @com.google.gson.annotations.SerializedName(value = "results")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.poke.pokemonapp.domain.model.Pokemon> pokemonResults = null;
    
    public GetAllCharacterResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer currentPage, @org.jetbrains.annotations.Nullable()
    java.lang.String nextPage, @org.jetbrains.annotations.Nullable()
    java.lang.String previousPage, @org.jetbrains.annotations.NotNull()
    java.util.List<com.poke.pokemonapp.domain.model.Pokemon> pokemonResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviousPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.poke.pokemonapp.domain.model.Pokemon> getPokemonResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.poke.pokemonapp.domain.model.Pokemon> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.poke.pokemonapp.domain.model.GetAllCharacterResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer currentPage, @org.jetbrains.annotations.Nullable()
    java.lang.String nextPage, @org.jetbrains.annotations.Nullable()
    java.lang.String previousPage, @org.jetbrains.annotations.NotNull()
    java.util.List<com.poke.pokemonapp.domain.model.Pokemon> pokemonResults) {
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