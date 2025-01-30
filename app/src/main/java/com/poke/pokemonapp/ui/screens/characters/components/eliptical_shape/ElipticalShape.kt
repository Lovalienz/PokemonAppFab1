package com.poke.pokemonapp.ui.screens.characters.components.eliptical_shape

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.R
import com.poke.pokemonapp.core.Config
import com.poke.pokemonapp.ui.screens.characters.CircularPhoto
import kotlinx.coroutines.delay

@Composable
fun EllipticalShape(
    viewModel: EllipticalViewModel = hiltViewModel(),
    onClose: () -> Unit = {},
    onPageChange: (Int) -> Unit = {},
    selectedPokemon: Int
) {
    val selectedPokemon = Config.pokemonInfo[selectedPokemon]
    var showCircle by remember { mutableStateOf(false) }
    var showComponents by remember { mutableStateOf(false) }
    val configuration = LocalConfiguration.current
    viewModel.screenHeight = configuration.screenHeightDp // Altura de la pantalla en dp
    val pagerState = rememberPagerState(
        pageCount = { 2 }
    )

    val progress by animateFloatAsState(
        targetValue = if (pagerState.getOffsetDistanceInPages(1) < 0.65f) 0f else 1f,
        animationSpec = tween(durationMillis = 500)
    )
    var repeatCount by remember { mutableStateOf(0) }
    var isAnimating by remember { mutableStateOf(true) }




    LaunchedEffect(isAnimating) {
        if (repeatCount < 2) {
            delay(600)
            isAnimating = !isAnimating
            repeatCount++
        }
    }

    val animatedBrush = Brush.verticalGradient(
        colors = listOf(
            lerp(colorResource(id = R.color.primary), Color.Black, progress),
            lerp(
                Color.Black,
                colorResource(id = R.color.primary),
                progress
            ) // El segundo color permanece constante
        )
    )

    LaunchedEffect(pagerState.currentPage) {
        onPageChange(pagerState.currentPage)
    }

    LaunchedEffect(Unit) {
        delay(200)
        showCircle = !showCircle
        delay(400)
        showComponents = !showComponents
        delay(20)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(viewModel.screenHeight.dp / 2),
        contentAlignment = Alignment.BottomCenter
    ) {


        AnimatedVisibility(visible = showCircle) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width * 1.3f
                val height = size.height * 1.1f

                drawOval(
                    brush = animatedBrush,
                    topLeft = Offset(
                        (size.width - width) / 2f,
                        -height / 5f
                    ),
                    size = androidx.compose.ui.geometry.Size(width, height)
                )
            }
        }



        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .align(Alignment.Center)
        ) { page ->
            when (page) {
                0 -> {

                    Box (
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {

                        CircularPhoto(
                            backGround = Color.Black,
                            placeHolder = R.drawable.placeholder,
                            url = selectedPokemon.sprites.photo,
                            name = selectedPokemon.name,
                            isPresented = true
                        )
                        Box (
                            Modifier.fillMaxSize().background(Color.Transparent),
                            contentAlignment = Alignment.CenterEnd
                        ){
                            Icon(
                                painter = painterResource(R.drawable.foward_arrow),
                                contentDescription = null
                            )
                        }
                    }
                }

                1 -> {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        CircularPhoto(
                            backGround = Color.Black,
                            placeHolder = R.drawable.placeholder,
                            url = selectedPokemon.sprites.back,
                            name = selectedPokemon.name,
                            isPresented = true
                        )
                    }
                }
            }
        }
        AnimatedVisibility(visible = showComponents) {
            Box(
                Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp),
                contentAlignment = Alignment.TopStart
            ) {
                Row {
                    IconButton(onClick = { onClose() }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = Color.White
                        )
                    }
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = selectedPokemon.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}
