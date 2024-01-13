package com.android.primeiroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.primeiroapp.ui.theme.PrimeiroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiroAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserList(userList = userList)
                }
            }
        }
    }
}

@Composable
fun UserList(userList: List<User>) {
    LazyColumn {
        items(userList) { item ->
            UserItem(user = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserListPreview() {
    PrimeiroAppTheme {
        UserList(userList = userList)
    }
}