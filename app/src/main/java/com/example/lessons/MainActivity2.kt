package com.example.lessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lessons.ui.theme.LessonsTheme
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHost


class MainActivity2 : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

            }
            val data = intent.getStringExtra("TextField")
            Column(
                modifier = Modifier.offset(10.dp, 100.dp),
            )
            {
                Row {
                    Text(
                        text = resources.getText(R.string.Value).toString(),
                        modifier = Modifier.height(20.dp),
                    )
                }
            }
            Column(
                modifier = Modifier.offset(150.dp, 90.dp),
            ) {
                TextField(
                    modifier = Modifier.width(70.dp),
                    value = data.toString(),
                    onValueChange = {},
                    label = { Text(text = "") }
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.offset(10.dp, 100.dp),
    )
    {
        Row {
            Text(
                text = "Значение",

            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LessonsTheme {
        Greeting("Android")
    }
}