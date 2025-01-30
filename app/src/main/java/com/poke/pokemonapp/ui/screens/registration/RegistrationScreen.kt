package com.poke.pokemonapp.ui.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.poke.pokemonapp.R
import com.poke.pokemonapp.ui.screens.registration.components.RegisterState
import com.poke.pokemonapp.ui.screens.registration.components.TextFieldType
import com.poke.pokemonapp.ui.screens.utils.DefaultTopBar

@Composable
fun RegisterScreen(onBack: () -> Unit){
    val vm: RegisterViewModel = hiltViewModel()
    Column (
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        DefaultTopBar(
            tittle = "Registro",
            content = {
                TextFieldType.entries.forEach { typeTextField ->
                    CustomTextField(
                        typeTextField,
                        value = when (typeTextField){
                            TextFieldType.EMAIL -> {
                                vm.email.value
                            }

                            TextFieldType.PASSWORD -> {
                                vm.password.value
                            }
                            TextFieldType.REPEAT_PASSWORD -> {
                                vm.newPassword.value
                            }
                        },
                        onValueChange = {
                            when (typeTextField){

                                TextFieldType.EMAIL -> {
                                    vm.email.value = it
                                }

                                TextFieldType.PASSWORD -> {
                                    vm.password.value = it
                                }
                                TextFieldType.REPEAT_PASSWORD -> {
                                    vm.newPassword.value = it


                                }
                            }
                        }
                    )
                    Spacer(Modifier.height(20.dp))
                }
                Button(
                    enabled = vm.isPasswordOk(),
                    onClick = {
                        vm.register()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Register")
                }
            },
            onBack = {
                onBack()
            }
        )

    }
    RegisterState()
}
@Composable
fun CustomTextField(textFieldType: TextFieldType, value: String, onValueChange: (String) -> Unit) {
    val vm: RegisterViewModel = hiltViewModel()
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(59.dp)
            .padding(end = 68.dp, start = 4.dp),
        value = value,
        leadingIcon = textFieldType.leadingIcon,
        maxLines = 1,
        keyboardOptions = textFieldType.keyboardOptions,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = colorResource(R.color.primary_light),
            errorBorderColor = Color.Red,
            focusedLabelColor = colorResource(id = R.color.primary)
            /*
               backgroundColor = Color(0x17009688),
            focusedBorderColor = colorResource(id = R.color.primary),
            unfocusedBorderColor = colorResource(id = R.color.secondary),
            cursorColor = colorResource(id = R.color.secondary),
            errorBorderColor = Color.Black,
            focusedLabelColor = colorResource(id = R.color.primary),
            placeholderColor = colorResource(id = R.color.primary),
            unfocusedLabelColor = colorResource(id = R.color.secondary)
             */
        ),
        label = {
            Text(
                text = textFieldType.label,
                fontSize = 16.sp,
                modifier = Modifier.padding(3.dp)
            )
        },
        placeholder = {
            Text(
                text = textFieldType.placeholder,
                fontSize = 16.sp
            )
        },
        onValueChange = onValueChange,
        textStyle = TextStyle(fontSize = 16.sp),
        enabled = true,
        shape = CircleShape,
        isError = when (textFieldType){

            TextFieldType.EMAIL -> {
                false
            }
            TextFieldType.PASSWORD -> {
                false
            }
            TextFieldType.REPEAT_PASSWORD -> {
                vm.password.value != vm.newPassword.value && vm.password.value != ""
            }
        }

    )
}