package com.android.primeiroapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UserItem(user: User) {

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