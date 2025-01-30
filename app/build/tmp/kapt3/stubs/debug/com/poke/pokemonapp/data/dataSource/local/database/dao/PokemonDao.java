package com.poke.pokemonapp.data.dataSource.local.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/poke/pokemonapp/data/dataSource/local/database/dao/PokemonDao;", "", "delete", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "getAll", "", "Lcom/poke/pokemonapp/data/dataSource/local/database/entities/PokemonEntity;", "getById", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "pokemon", "insertAll", "pokemons", "app_debug"})
@androidx.room.Dao()
public abstract interface PokemonDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity pokemon);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity> pokemons);
    
    @androidx.room.Query(value = "SELECT * FROM pokemons ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity> getAll();
    
    @androidx.room.Query(value = "DELETE FROM pokemons  WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM pokemons")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "SELECT * FROM pokemons WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.poke.pokemonapp.data.dataSource.local.database.entities.PokemonEntity> $completion);
}