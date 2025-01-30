package com.poke.pokemonapp.ui.screens.utils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.poke.pokemonapp.R
import com.poke.pokemonapp.ui.theme.customFontFamily

@Composable
fun DefaultTopBar(
    content: @Composable () -> Unit,
    showBack: Boolean = true,
    tittle: String,
    onBack: () -> Unit = {}
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 30.dp)

    ) {
        Box(
            Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (showBack) {
                    IconButton(
                        onClick = {
                            onBack()
                        }
                    ) {
                        androidx.compose.material3.Icon(
                            painter = painterResource(R.drawable.ic_arrow),
                            tint = MaterialTheme.colorScheme.onBackground,
                            contentDescription = null
                        )
                    }
                }
                Spacer(Modifier.width(10.dp))
                Text(
                    text = tittle,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    fontFamily = customFontFamily,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }


        }
        content()
    }
}