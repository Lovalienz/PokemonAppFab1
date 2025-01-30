package com.poke.pokemonapp.ui.screens.characters


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.Config
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.poke.pokemonapp.domain.model.Pokemon
import com.poke.pokemonapp.ui.screens.characters.components.AddFavoriteState
import com.poke.pokemonapp.ui.screens.characters.components.PageOneInfo
import com.poke.pokemonapp.ui.screens.characters.components.PageTwoInfo
import com.poke.pokemonapp.ui.screens.characters.components.Progressbar
import com.poke.pokemonapp.ui.screens.characters.components.SheetPaddingContent
import com.poke.pokemonapp.ui.screens.characters.components.eliptical_shape.EllipticalShape
import kotlinx.coroutines.launch

@Composable
fun CharactersScreen(
    viewModel: CharactersViewModel = hiltViewModel(),
    onClickFavorites: () -> Unit
) {
    val characters = viewModel.characters.collectAsLazyPagingItems()
    when {
        characters.loadState.refresh is LoadState.Loading && characters.itemCount == 0 -> {
            Progressbar()
        }

        characters.loadState.hasError -> {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ha ocurrido un error")
            }
        }

        else -> {
            CharactersContent(
                characters = characters,
                onClickFavorites = {
                    onClickFavorites()
                }
                )
            if (characters.loadState.append is LoadState.Loading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Progressbar()
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharactersContent(
    characters: LazyPagingItems<Pokemon>,
    onClickFavorites: () ->Unit
) {
    val sheetState = rememberBottomSheetScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    var currentPage by remember { mutableIntStateOf(5) }
    var selected by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AddFavoriteState()
        AnimatedVisibility(
            visible = selected != 0
        ) {

            EllipticalShape(
                onClose = {
                    selected = 0
                    currentPage = 5
                },
                onPageChange = { pageNumber ->
                    when (pageNumber) {
                        0 -> {
                            currentPage = 0
                        }

                        1 -> {
                            currentPage = 1
                        }
                    }
                },
                selectedPokemon = selected
            )
        }
        AnimatedVisibility(
            visible = currentPage == 0
        ) {
            PageOneInfo(com.poke.pokemonapp.core.Config.pokemonInfo[selected])
        }
        AnimatedVisibility(
            visible = currentPage == 1
        ) {
            PageTwoInfo(com.poke.pokemonapp.core.Config.pokemonInfo[selected])
        }
        AnimatedVisibility(
            visible = currentPage == 5
        ) {
            SheetPaddingContent(
                characters,
                onClickPokemon = { index ->
                    selected = index
                    coroutineScope.launch {
                        sheetState.bottomSheetState.expand()
                    }
                },
                onClickFavorites = {
                    onClickFavorites()
                }
            )
        }
    }
}

