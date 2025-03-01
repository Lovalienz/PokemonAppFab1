// Generated by Dagger (https://dagger.dev).
package com.poke.pokemonapp.data.dataSource.remote;

import com.poke.pokemonapp.data.dataSource.remote.service.FireStoreService;
import com.poke.pokemonapp.data.dataSource.remote.service.FirebaseAuthService;
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
public final class FirebaseFireStoreRemoteDataSourceImpl_Factory implements Factory<FirebaseFireStoreRemoteDataSourceImpl> {
  private final Provider<FireStoreService> serviceProvider;

  private final Provider<FirebaseAuthService> authServiceProvider;

  public FirebaseFireStoreRemoteDataSourceImpl_Factory(Provider<FireStoreService> serviceProvider,
      Provider<FirebaseAuthService> authServiceProvider) {
    this.serviceProvider = serviceProvider;
    this.authServiceProvider = authServiceProvider;
  }

  @Override
  public FirebaseFireStoreRemoteDataSourceImpl get() {
    return newInstance(serviceProvider.get(), authServiceProvider.get());
  }

  public static FirebaseFireStoreRemoteDataSourceImpl_Factory create(
      Provider<FireStoreService> serviceProvider,
      Provider<FirebaseAuthService> authServiceProvider) {
    return new FirebaseFireStoreRemoteDataSourceImpl_Factory(serviceProvider, authServiceProvider);
  }

  public static FirebaseFireStoreRemoteDataSourceImpl newInstance(FireStoreService service,
      FirebaseAuthService authService) {
    return new FirebaseFireStoreRemoteDataSourceImpl(service, authService);
  }
}
