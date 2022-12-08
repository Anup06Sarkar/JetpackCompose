package com.anup.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.anup.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(.5f)
                .fillMaxWidth()
                .border(5.dp, Color.Blue)
                .padding(top = 5.dp)
                .border(15.dp, Color.Yellow)
                .padding(10.dp)
                .border(15.dp, Color.Red)
                .padding(16.dp)) {
                Text(text = "Hello", modifier = Modifier.clickable {
                    Log.e("Clicked","hello")
                })
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "World")
            }
        }
    }
}


