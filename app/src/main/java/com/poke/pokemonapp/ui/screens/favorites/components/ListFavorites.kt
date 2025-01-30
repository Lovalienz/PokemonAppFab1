package com.poke.pokemonapp.ui.screens.favorites.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.paging.compose.LazyPagingItems
import com.poke.pokemonapp.R
import com.poke.pokemonapp.core.Config
import com.poke.pokemonapp.data.dataSource.remote.dtos.FavoriteDTO
import com.poke.pokemonapp.domain.model.Pokemon
import com.poke.pokemonapp.ui.screens.characters.CircularPhoto
import com.poke.pokemonapp.ui.screens.characters.components.PokemonItem
import com.poke.pokemonapp.ui.screens.characters.components.capitalizeFirstLetter

@Composable
fun ListFavorites(
    characters: List<FavoriteDTO>,
    onClickPokemon: (String) -> Unit

) {
    LazyColumn(

    ) {
        items(characters.size) { index ->
            characters[index].let { characterModel ->
                FavoriteItem(
                    characterModel,
                    index,
                    onClickPokemon ={ id ->
                        onClickPokemon(id)
                    }
                )
            }
        }
    }
}

@Composable
fun FavoriteItem(
    characterModel: FavoriteDTO,
    index: Int,
    onClickPokemon: (String) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    ConstraintLayout(
        Modifier
            .fillMaxWidth()
            .height(105.dp)
            .clickable(
                indication = null,
                interactionSource = interactionSource
            ) {
                onClickPokemon(characterModel.id)
            }
            .padding(horizontal = 20.dp)
    ) {

        val (boxFirst, boxSecond, _) = createRefs()
        Row(modifier = Modifier
            .fillMaxSize()
            .constrainAs(boxFirst) {
                end.linkTo(parent.end)
            }
            .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .clip(
                        RoundedCornerShape(15.dp)
                    )
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Row {
                    Spacer(modifier = Modifier.padding(horizontal = 40.dp))
                    Spacer(modifier = Modifier.padding(vertical = 3.dp))
                    Text(
                        text = capitalizeFirstLetter(characterModel.name),
                        fontSize = 17.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.align(
                            Alignment.CenterVertically
                        )
                    )

                }
            }
        }
        CircularPhoto(
            backGround = Color.Black,
            placeHolder = R.drawable.placeholder,
            url = characterModel.frontImageUrl,
            name = characterModel.name
        )
    }
}


