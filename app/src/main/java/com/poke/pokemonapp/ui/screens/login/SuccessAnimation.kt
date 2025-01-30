package com.poke.pokemonapp.ui.screens.login

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.poke.pokemonapp.R
import kotlinx.coroutines.delay



@Composable
fun SuccessScreen(
    text: String = ""
){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.success))
    var showText by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        delay(700)
        showText = true
        delay(1100)
        showText = false
    }

    Box (
        Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ){
        LottieAnimation(
            composition,
            modifier = Modifier
                .size(100.dp)
                .scale(2f),
            iterations = 1
        )
        Spacer(modifier = Modifier.padding(vertical = 3.dp))
        AnimatedVisibility(
            visible = showText,
            enter = fadeIn(animationSpec = tween(durationMillis = 500))
        ) {
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

    }
}