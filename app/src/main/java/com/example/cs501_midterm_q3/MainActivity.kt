package com.example.cs501_midterm_q3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cs501_midterm_q3.ui.theme.Cs501_midterm_q3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cs501_midterm_q3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LazyList(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LazyList(modifier: Modifier = Modifier) {
    val students = listOf(
        "Alice","Bob","Charlie","Dana","Eric",
        "Fatima","Grace","Hiro","Isabel","Jack",
        "Karen","Luis","Maya","Nate","Olivia",
        "Priya","Quinn","Ravi","Sara","Tom"
    )

    LazyColumn(modifier = modifier) {
        items(students) { student ->
            Text(
                text = student,
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}