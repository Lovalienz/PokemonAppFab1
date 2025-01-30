package com.poke.pokemonapp.ui.screens.registration.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.poke.pokemonapp.R


enum class TextFieldType(
    val label: String,
    val placeholder: String,
    val keyboardOptions: KeyboardOptions,
    val leadingIcon: @Composable (() -> Unit),
    val onValueChange: (String) -> Unit,
    hasError: Boolean = false
) {

    EMAIL(
        label = "Email",
        placeholder = "Email",
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.email),
                contentDescription = null,
                modifier = androidx.compose.ui.Modifier.size(29.dp)
            )
        },
        onValueChange = { newValue -> /* Call your function to handle the email input */ }
    ),
    PASSWORD(
        label = "Contraseña",
        placeholder = "Contraseña",
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Next
        ),
        leadingIcon = {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Lock Icon"
            )
        },
        onValueChange = { newValue -> /* Call your function to handle the email input */ }
    ),
    REPEAT_PASSWORD(
        label = "Repetir contraseña",
        placeholder = "Repetir contraseña",
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Lock Icon"
            )
        },
        onValueChange = { newValue -> /* Call your function to handle the email input */ },

        )
}

