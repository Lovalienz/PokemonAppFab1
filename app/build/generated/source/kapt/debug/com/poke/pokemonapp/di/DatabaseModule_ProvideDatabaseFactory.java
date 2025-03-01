// Generated by Dagger (https://dagger.dev).
package com.poke.pokemonapp.di;

import android.app.Application;
import com.poke.pokemonapp.data.dataSource.local.database.PokemonDB;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<PokemonDB> {
  private final Provider<Application> appProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public PokemonDB get() {
    return provideDatabase(appProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Application> appProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(appProvider);
  }

  public static PokemonDB provideDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabase(app));
  }
}
