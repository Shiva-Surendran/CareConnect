package com.example.first

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FormState {
    var name by mutableStateOf("")
    var age by mutableStateOf("")
    var medicalInfo by mutableStateOf("")
    var allergies by mutableStateOf("")
    var bloodType by mutableStateOf("")
    var caretakerPhone by mutableStateOf("")
    var neighbourPhone by mutableStateOf("")
}

@Composable
fun FormScreen() {
    val formState = remember { FormState() }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = formState.name,
            onValueChange = { formState.name = it },
            label = { Text("Name") }
        )
        OutlinedTextField(
            value = formState.age,
            onValueChange = { formState.age = it },
            label = { Text("Age") }
        )
        OutlinedTextField(
            value = formState.medicalInfo,
            onValueChange = { formState.medicalInfo = it },
            label = { Text("Medical Info") }
        )
        OutlinedTextField(
            value = formState.allergies,
            onValueChange = { formState.allergies = it },
            label = { Text("Allergies") }
        )
        OutlinedTextField(
            value = formState.bloodType,
            onValueChange = { formState.bloodType = it },
            label = { Text("Blood Type") }
        )
        OutlinedTextField(
            value = formState.caretakerPhone,
            onValueChange = { formState.caretakerPhone = it },
            label = { Text("Caretaker Phone") },
            isError = formState.caretakerPhone.length != 10
        )
        OutlinedTextField(
            value = formState.neighbourPhone,
            onValueChange = { formState.neighbourPhone = it },
            label = { Text("Neighbour Phone") },
            isError = formState.neighbourPhone.length != 10
        )

        Button(
            onClick = { /* Handle form submission here */ },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Submit")
        }
    }
}

@Preview
@Composable
fun PreviewFormScreen() {
    FormScreen()
}
