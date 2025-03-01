// Generated by Dagger (https://dagger.dev).
package com.poke.pokemonapp.ui.screens.favorites;

import com.poke.pokemonapp.domain.useCases.firebaseUseCases.FirestoreUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class FavoritesVieModel_Factory implements Factory<FavoritesVieModel> {
  private final Provider<FirestoreUseCases> firebaseUseCasesProvider;

  public FavoritesVieModel_Factory(Provider<FirestoreUseCases> firebaseUseCasesProvider) {
    this.firebaseUseCasesProvider = firebaseUseCasesProvider;
  }

  @Override
  public FavoritesVieModel get() {
    return newInstance(firebaseUseCasesProvider.get());
  }

  public static FavoritesVieModel_Factory create(
      Provider<FirestoreUseCases> firebaseUseCasesProvider) {
    return new FavoritesVieModel_Factory(firebaseUseCasesProvider);
  }

  public static FavoritesVieModel newInstance(FirestoreUseCases firebaseUseCases) {
    return new FavoritesVieModel(firebaseUseCases);
  }
}
