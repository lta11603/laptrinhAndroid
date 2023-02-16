package com.example.xucxac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.Modifier
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            DiceRollerTheme{

            }
        }
    }
}

@Preview
@Composable
fun DiceRollerApp() {

}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {

}
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        DiceRollerTheme {
            DiceRollerApp()
        }
    }
}
@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage()
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
}