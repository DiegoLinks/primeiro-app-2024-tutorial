package com.android.primeiroapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserItem(user: User) {
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {
        Text(
            text = user.name,
            modifier = Modifier.padding(top = 4.dp)
        )

        Text(
            text = user.nickname,
            modifier = Modifier.padding(top = 4.dp),
            color = Color.Gray
        )

        Text(
            text = user.bio,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun UserItemPreview() {

    val user = User(
        name = "Jhon",
        nickname = "@Jhon",
        bio = "Uma descrição qualquer pra bio do Jhon.",
        profileImg = ""
    )

    UserItem(user = user)
}