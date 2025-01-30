package com.poke.pokemonapp.data.dataSource.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/local/PokemonLocalDataSourceImpl;", "Lcom/poke/pokemonapp/data/dataSource/local/PokemonLocalDataSource;", "pokemonDao", "Lcom/poke/pokemonapp/data/dataSource/local/database/dao/PokemonDao;", "(Lcom/poke/pokemonapp/data/dataSource/local/database/dao/PokemonDao;)V", "delete", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Lcom/poke/pokemonapp/data/dataSource/local/database/entities/PokemonEntity;", "getById", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "pokemon", "(Lcom/poke/pokemonapp/data/dataSource/local/database/entities/PokemonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "pokemons", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PokemonLocalDataSourceImpl implements com.poke.pokemonapp.data.dataSource.local.PokemonLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao pokemonDao = null;
    
    @javax.inject.Inject()
    public PokemonLocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.database.dao.PokemonDao pokemonDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity> pokemons, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity> $completion) {
        return null;
    }
}