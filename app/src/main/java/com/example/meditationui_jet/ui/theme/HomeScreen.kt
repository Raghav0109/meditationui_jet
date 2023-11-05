package com.example.meditationui_jet.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(){

    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
    )   {
            Column {

            }
        }
}
@Composable
fun GreetingSection(
    name:String ="Raghav"

) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ){
        Column (
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text="Good morning, $name,",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}