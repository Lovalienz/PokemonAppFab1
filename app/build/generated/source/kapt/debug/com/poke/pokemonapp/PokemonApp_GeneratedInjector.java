package com.poke.pokemonapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PokemonApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PokemonApp_GeneratedInjector {
  void injectPokemonApp(PokemonApp pokemonApp);
}
