package com.poke.pokemonapp.ui.screens.login


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import com.poke.pokemonapp.R
import com.poke.pokemonapp.ui.theme.customFontFamily

@Composable
fun LoginScreen(
    onNavigationHome: () -> Unit,
    onClickRegistration: () -> Unit

) {
    val viewModel: LoginViewModel = hiltViewModel()
    val canvasColor = colorResource(R.color.primary)
    val focusManager = LocalFocusManager.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(canvasColor),

        ) {
        Box(modifier = Modifier
            .background(canvasColor)
            .fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.pika_login),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
            )

            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .align(Alignment.BottomCenter)

            ) {
                val path = Path().apply {
                    moveTo(0f, size.height)
                    quadraticBezierTo(
                        size.width / 1f, -size.height / 1.5f, // Punto de control
                        size.width, size.height // Final
                    )
                    lineTo(size.width, size.height * 2)
                    lineTo(0f, size.height * 2)
                    close()
                }
                drawPath(path, color = canvasColor)
            }


        }



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            colorResource(R.color.primary),
                            MaterialTheme.colorScheme.background
                        ),
                        startY = 0f,
                        endY = 550f
                    )
                )
                .padding( bottom = 60.dp, start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                stringResource(R.string.app_name),
                fontFamily = customFontFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.End)
            )
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Login to your account",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Input para Full Name
            OutlinedTextField(
                value = viewModel.email.value,
                onValueChange = {
                    viewModel.email.value = it
                },
                label = { Text("Full Name") },
                leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person Icon") },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp)), // Redondea las esquinas
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(R.color.primary), // Color cuando está enfocado
                    unfocusedBorderColor = colorResource(R.color.primary_light)// Color cuando no está enfocado
                ),
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Next)
                    }
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,

                    imeAction = ImeAction.Next // Establece la acción de "Next" en el teclado
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Input para Password

            OutlinedTextField(
                value = viewModel.password.value,
                onValueChange = {
                    viewModel.password.value = it
                },
                label = { Text("Password") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Lock Icon") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp)), // Redondea las esquinas
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = colorResource(R.color.primary), // Color cuando está enfocado
                    unfocusedBorderColor = colorResource(R.color.primary_light)// Color cuando no está enfocado
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done // Establece la acción de "Next" en el teclado
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Forgot Password?",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            // Botón de Login
            Button(
                enabled = viewModel.enableLogin(viewModel.email.value, viewModel.password.value),
                onClick = {
                    viewModel.login()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Don't have an account? Sign up",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onClickRegistration()
                    },
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
    LoginState(
        onNavigationHome = {
            onNavigationHome()
        }
    )
}




