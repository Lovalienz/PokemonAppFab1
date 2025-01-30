package com.poke.pokemonapp.ui.screens.characters.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.poke.pokemonapp.domain.model.Pokemon
import com.poke.pokemonapp.ui.theme.customFontFamily

@Composable
fun SheetPaddingContent(
    characters: LazyPagingItems<Pokemon>,
    onClickPokemon: (Int) -> Unit,
    onClickFavorites: () -> Unit

) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 40.dp)

    ) {

        Box(
            Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "PokeApp",
                    fontSize = 30.sp,
                    fontFamily = customFontFamily
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = "Favoritos",
                    fontSize = 20.sp,
                    fontFamily = customFontFamily,
                    modifier = Modifier.clickable {
                        onClickFavorites()
                    }
                )
            }

        }
        ListCharacters(
            characters = characters,
            onClickPokemon = { index ->
                onClickPokemon(index)
            }
        )

    }


}

@Preview(showBackground = true)
@Composable
fun PreviewSheetPaddingContent() {
//    SheetPaddingContent()
}