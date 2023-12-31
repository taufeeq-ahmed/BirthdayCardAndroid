package com.example.birthdaycardandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycardandroid.ui.theme.BirthdayCardAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingScreen(message = "Happy Birthday Sam!", from = "From Taufeeq")
                }
            }
        }
    }
}

@Composable
fun GreetingScreen(message:String,from:String){
    val backgroundImage = painterResource(id = R.drawable.androidparty)

    Box{
        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Text(
                text = message ,
                fontSize = 70.sp,
                lineHeight = 80.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )
            Text(
                text = from,
                fontSize = 36.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .padding(26.dp)
                    .fillMaxWidth()
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    BirthdayCardAndroidTheme {
        GreetingScreen(
            message = stringResource(R.string.happy_birthday_android),
            from = stringResource(R.string.ios)
        )
    }
}
