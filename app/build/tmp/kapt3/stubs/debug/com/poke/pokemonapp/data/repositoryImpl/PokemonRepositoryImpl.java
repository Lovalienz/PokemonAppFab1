package com.poke.pokemonapp.data.repositoryImpl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/poke/pokemonapp/data/repositoryImpl/PokemonRepositoryImpl;", "Lcom/poke/pokemonapp/domain/repositories/PokemonRepository;", "remoteDataSource", "Lcom/poke/pokemonapp/data/dataSource/remote/PokemonRemoteDataSourceImpl;", "(Lcom/poke/pokemonapp/data/dataSource/remote/PokemonRemoteDataSourceImpl;)V", "getAlCharacters", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/poke/pokemonapp/domain/model/Pokemon;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PokemonRepositoryImpl implements com.poke.pokemonapp.domain.repositories.PokemonRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.data.dataSource.remote.PokemonRemoteDataSourceImpl remoteDataSource = null;
    public static final int MAX_ITEMS = 10;
    public static final int PREFETCH_ITEMS = 5;
    @org.jetbrains.annotations.NotNull()
    public static final com.poke.pokemonapp.data.repositoryImpl.PokemonRepositoryImpl.Companion Companion = null;
    
    public PokemonRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.data.dataSource.remote.PokemonRemoteDataSourceImpl remoteDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAlCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.poke.pokemonapp.domain.model.Pokemon>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/poke/pokemonapp/data/repositoryImpl/PokemonRepositoryImpl$Companion;", "", "()V", "MAX_ITEMS", "", "PREFETCH_ITEMS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}