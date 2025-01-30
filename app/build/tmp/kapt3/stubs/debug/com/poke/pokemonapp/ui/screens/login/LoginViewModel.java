package com.poke.pokemonapp.ui.screens.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR;\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/poke/pokemonapp/ui/screens/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authUseCase", "Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;", "(Lcom/poke/pokemonapp/domain/useCases/firebaseUseCases/FirestoreUseCases;)V", "email", "Landroidx/compose/runtime/MutableState;", "", "getEmail", "()Landroidx/compose/runtime/MutableState;", "setEmail", "(Landroidx/compose/runtime/MutableState;)V", "<set-?>", "Lcom/poke/pokemonapp/core/Resource;", "loginResponse", "getLoginResponse", "()Lcom/poke/pokemonapp/core/Resource;", "setLoginResponse", "(Lcom/poke/pokemonapp/core/Resource;)V", "loginResponse$delegate", "Landroidx/compose/runtime/MutableState;", "password", "getPassword", "setPassword", "enableLogin", "", "login", "Lkotlinx/coroutines/Job;", "saveSeason", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases authUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState loginResponse$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.String> email;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.lang.String> password;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases authUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.poke.pokemonapp.core.Resource<java.lang.String> getLoginResponse() {
        return null;
    }
    
    public final void setLoginResponse(@org.jetbrains.annotations.Nullable()
    com.poke.pokemonapp.core.Resource<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job login() {
        return null;
    }
    
    public final boolean enableLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveSeason() {
        return null;
    }
}