package com.poke.pokemonapp.ui.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.poke.pokemonapp.ui.screens.characters.CharactersScreen
import com.poke.pokemonapp.ui.screens.favorites.FavoritesScreen
import com.poke.pokemonapp.ui.screens.login.LoginScreen
import com.poke.pokemonapp.ui.screens.registration.RegisterScreen
import com.poke.pokemonapp.ui.screens.splash.SplashScreen

@Composable
fun MainNavigation() {
    // Controlador de la navegación
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationGraph.SPLASH) {
        // SplashScreen Composable
        composable(NavigationGraph.SPLASH) {
            SplashScreen (onNavigation = {
                navController.navigate(NavigationGraph.LOGIN) {
                popUpTo(NavigationGraph.SPLASH) { inclusive = true } // Elimina el Splash de la pila
            }
            })
        }
        // HomeScreen Composable
        composable(NavigationGraph.CHARACTERS) {
            CharactersScreen(
                onClickFavorites = {
                    navController.navigate(NavigationGraph.FAVORITES)

                }
            )
        }
        composable(NavigationGraph.REGISTRATION) {
            RegisterScreen {
                navController.popBackStack()
            }
        }
        composable(NavigationGraph.FAVORITES) {
            FavoritesScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(NavigationGraph.LOGIN) {
            LoginScreen(
                onNavigationHome = {
                    navController.navigate(NavigationGraph.CHARACTERS) {
                        popUpTo(NavigationGraph.LOGIN) { inclusive = true }
                    }
                },
                onClickRegistration = {
                    navController.navigate(NavigationGraph.REGISTRATION)
                }
            )
        }
    }
}