package com.poke.pokemonapp.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.poke.pokemonapp.R
import com.poke.pokemonapp.ui.theme.PokeAppTheme
import com.poke.pokemonapp.ui.theme.customFontFamily


@SuppressLint("UseOfNonLambdaOffsetOverload")
@Composable
fun SplashScreen(
    onNavigation: () -> Unit,
    splashViewModel: SplashViewModel = hiltViewModel()
) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash_anim))
    // observe the viewmodel state
    val isVisibleLottie by splashViewModel.isVisibleLottie.collectAsState()
    val isVisibleText by splashViewModel.isVisibleText.collectAsState()
    val isVisibleName by splashViewModel.isVisibleName.collectAsState()
    val offsetY by animateDpAsState(targetValue = if (isVisibleText) 40.dp else 0.dp)

    LaunchedEffect(Unit) {
        splashViewModel.startAnimation {
            onNavigation()
        }
    }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            visible = isVisibleLottie,
            enter = scaleIn(),
            exit = scaleOut(tween(300))
        ) {
            LottieAnimation(
                composition = composition,
                modifier = Modifier
                    .size(400.dp)
                    .offset(y = offsetY),
                iterations = 1
            )
        }
        AnimatedVisibility(
            visible = isVisibleText,
            enter = scaleIn(),
            exit = scaleOut()
        ) {
            Text(
                text = "PokeApp",
                fontFamily = customFontFamily,
                fontSize = 80.sp
            )
        }


        AnimatedVisibility(
            visible = isVisibleName,
            enter = scaleIn(tween(1000)),
        ) {
            Text(
                text = "By Fabián",
                fontFamily = customFontFamily,
                fontSize = 50.sp
            )
        }
    }


}


@Preview
@Composable
fun PreviewSplash() {
    PokeAppTheme {

    }
}