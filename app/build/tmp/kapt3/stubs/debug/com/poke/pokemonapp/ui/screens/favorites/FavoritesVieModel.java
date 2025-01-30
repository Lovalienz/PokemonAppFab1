package com.poke.pokemonapp.ui.screens.favorites;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0016H\u0002R;\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000RG\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u00062\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/poke/pokemonapp/ui/screens/favorites/FavoritesVieModel;", "Landroidx/lifecycle/ViewModel;", "firebaseUseCases", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;", "(Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;)V", "<set-?>", "Lcom/poke/pokemonapp/core/Resource;", "", "deleteFavoriteResponse", "getDeleteFavoriteResponse", "()Lcom/poke/pokemonapp/core/Resource;", "setDeleteFavoriteResponse", "(Lcom/poke/pokemonapp/core/Resource;)V", "deleteFavoriteResponse$delegate", "Landroidx/compose/runtime/MutableState;", "", "Lcom/poke/pokemonapp/data/dataSource/remote/dtos/FavoriteDTO;", "getFavoritesResponse", "getGetFavoritesResponse", "setGetFavoritesResponse", "getFavoritesResponse$delegate", "deleteFavorite", "Lkotlinx/coroutines/Job;", "pokemonId", "getFavorites", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FavoritesVieModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases firebaseUseCases = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState getFavoritesResponse$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState deleteFavoriteResponse$delegate = null;
    
    @javax.inject.Inject()
    public FavoritesVieModel(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases firebaseUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.poke.pokemonapp.core.Resource<java.util.List<com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO>> getGetFavoritesResponse() {
        return null;
    }
    
    public final void setGetFavoritesResponse(@org.jetbrains.annotations.Nullable()
    com.poke.pokemonapp.core.Resource<? extends java.util.List<com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.poke.pokemonapp.core.Resource<java.lang.String> getDeleteFavoriteResponse() {
        return null;
    }
    
    public final void setDeleteFavoriteResponse(@org.jetbrains.annotations.Nullable()
    com.poke.pokemonapp.core.Resource<java.lang.String> p0) {
    }
    
    private final kotlinx.coroutines.Job getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonId) {
        return null;
    }
}