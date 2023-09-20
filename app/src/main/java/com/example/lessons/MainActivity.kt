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
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lessons.ui.theme.LessonsTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by rememberSaveable {
                mutableStateOf("0.0")
            }

            var text_1 by rememberSaveable {
                mutableStateOf("0.0")
            }
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start,
            ) {
                Button(onClick = {
                    val sumNumPl = text.toFloat() + text_1.toFloat()
                    val str_sum = sumNumPl.toString()
                    text = str_sum
                }) {
                    Text(text = "Добавить")
                }
            }
            Column(
                modifier = Modifier.padding(150.dp, 330.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    modifier = Modifier.width(70.dp),
                    value = text_1,
                    onValueChange = {
                        text_1 = it
                    },
                    label = { Text("") }
                )

            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.End,
            ) {
                Button(onClick = {
                    val sumNumPl = text.toFloat() - text_1.toFloat()
                    val str_sum = sumNumPl.toString()
                    text = str_sum
                }) {
                    Text(text = "Отнять")
                }

            }
            Column(
                modifier = Modifier.padding(0.dp, 300.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start
            )
            {
                Row {
                    Text(
                        text = "Значение",
                        modifier = Modifier.height(20.dp),
                    )
                }
            }
            Column(
                modifier = Modifier.padding(150.dp, 270.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                TextField(
                    modifier = Modifier.width(70.dp),
                    value = text,
                    onValueChange = {
                        text = it
                    },
                    label = { Text("") }
                )
            }

            Column(
                modifier = Modifier.offset(260.dp, 280.dp),

                ) {
                Button(onClick = {
                    intent.putExtra("TextField", text)
                    startActivity(intent)
                }) {
                    Text(text = "Перейти")
                }

            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
        ) {
            Button(onClick = {}) {
                Text(text = "Добавить")
            }
        }
        Column(
            modifier = Modifier.padding(150.dp, 330.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                modifier = Modifier.width(70.dp),
                value = "",
                onValueChange = {},
                label = { Text("") }
            )

        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.End,
        ) {
            Button(onClick = {}) {
                Text(text = "Отнять")
            }
        }
        Column(
            modifier = Modifier.padding(0.dp, 300.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        )
        {
            Row {
                Text(
                    text = "Значение",
                    modifier = Modifier.height(20.dp),
                )
            }
        }
        Column(
            modifier = Modifier.padding(150.dp, 270.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            TextField(
                modifier = Modifier.width(70.dp),
                value = "text",
                onValueChange = {},
                label = { Text("") }
            )
        }
        Column(
            modifier = Modifier.offset(260.dp, 280.dp),
            ) {
            Button(onClick = {}) {
                Text(text = "Перейти")
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
}

