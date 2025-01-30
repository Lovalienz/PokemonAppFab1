package com.poke.pokemonapp.ui.screens.characters.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.R
import com.poke.pokemonapp.domain.model.Abilities
import com.poke.pokemonapp.domain.model.Ability
import com.poke.pokemonapp.domain.model.CharacterModel
import com.poke.pokemonapp.domain.model.FrontDefault
import com.poke.pokemonapp.ui.screens.characters.CharactersViewModel
import com.poke.pokemonapp.ui.theme.customFontFamily


@Composable
fun PageTwoInfo(
    pokemonInfo: CharacterModel,
    viewModel: CharactersViewModel = hiltViewModel()
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Abilities",
                fontWeight = FontWeight.Bold,
                fontFamily = customFontFamily,
                fontSize = 30.sp
            )
            Spacer(Modifier.width(17.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                pokemonInfo.abilities.forEach { ability ->
                    Text(
                        text = ability.ability.toString(),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = pokemonInfo.weight.toString(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
                Text(
                    text = "Peso",
                    fontWeight = FontWeight.Light,
                    fontSize = 18.sp
                )
            }
            Spacer(Modifier.weight(1f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = {
                        viewModel.setFavorite(pokemonInfo)
                    }
                ) {
                    Icon(
                        painter = painterResource(R.drawable.favorite),
                        contentDescription = null
                    )
                }
                Text(
                    text = "Agregar favorito",
                    fontWeight = FontWeight.Light,
                    fontSize = 18.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PageTwoInfoPreview() {
    val mockCharacter = CharacterModel(
        id = 1,
        name = "Pikachu",
        height = 40,
        weight = 60,
        abilities = listOf(Abilities(Ability(name = "Fuego", true))),
        sprites = FrontDefault(
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png",
            back = "sad"
        ),
        isFavorite = false
    )

    PageTwoInfo(pokemonInfo = mockCharacter)
}