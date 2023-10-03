package com.example.feliznatal2023

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feliznatal2023.ui.theme.FelizNatal2023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FelizNatal2023Theme {
            TextoCartão()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextoCartão(){
    Image(
        painter = painterResource(id = R.drawable.arvoredenatal) ,
        contentDescription =null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F,
        modifier = Modifier.fillMaxSize(),
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Feliz Natal 2023 !!!",
            fontSize = 80.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Cursive,
            lineHeight = 110.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 150.dp)

        )
        Dedicatoria(nomes = "De Carlos H.")
        Dedicatoria(nomes = "Para Anne")

    }

}

@Composable
fun Dedicatoria(nomes: String){
    Text(
        text = nomes,
        fontSize = 40.sp,
        textAlign = TextAlign.End,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        color = Color.Red,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 30.dp)
    )
}