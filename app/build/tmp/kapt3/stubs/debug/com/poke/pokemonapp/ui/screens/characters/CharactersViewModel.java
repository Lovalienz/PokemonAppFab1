package com.poke.pokemonapp.ui.screens.characters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/poke/pokemonapp/ui/screens/characters/CharactersViewModel;", "Landroidx/lifecycle/ViewModel;", "pokemonUseCase", "Lcom/poke/pokemonapp/domain/useCases/pokemonsUseCases/PokemonUseCase;", "firestoreUseCases", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;", "(Lcom/poke/pokemonapp/domain/useCases/pokemonsUseCases/PokemonUseCase;Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;)V", "_characters", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/poke/pokemonapp/domain/model/Pokemon;", "<set-?>", "Lcom/poke/pokemonapp/core/Resource;", "", "addFavoriteResponse", "getAddFavoriteResponse", "()Lcom/poke/pokemonapp/core/Resource;", "setAddFavoriteResponse", "(Lcom/poke/pokemonapp/core/Resource;)V", "addFavoriteResponse$delegate", "Landroidx/compose/runtime/MutableState;", "characters", "Lkotlinx/coroutines/flow/StateFlow;", "getCharacters", "()Lkotlinx/coroutines/flow/StateFlow;", "getAllCharacters", "", "setFavorite", "Lkotlinx/coroutines/Job;", "pokemonInfo", "Lcom/poke/pokemonapp/domain/model/CharacterModel;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CharactersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.pokemonsUseCases.PokemonUseCase pokemonUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases firestoreUseCases = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.poke.pokemonapp.domain.model.Pokemon>> _characters = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.poke.pokemonapp.domain.model.Pokemon>> characters = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState addFavoriteResponse$delegate = null;
    
    @javax.inject.Inject()
    public CharactersViewModel(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.pokemonsUseCases.PokemonUseCase pokemonUseCase, @org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases firestoreUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.poke.pokemonapp.domain.model.Pokemon>> getCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.poke.pokemonapp.core.Resource<java.lang.String> getAddFavoriteResponse() {
        return null;
    }
    
    public final void setAddFavoriteResponse(@org.jetbrains.annotations.Nullable()
    com.poke.pokemonapp.core.Resource<java.lang.String> p0) {
    }
    
    private final void getAllCharacters() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setFavorite(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.model.CharacterModel pokemonInfo) {
        return null;
    }
}