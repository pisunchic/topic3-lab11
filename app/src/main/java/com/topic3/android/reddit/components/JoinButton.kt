package com.topic3.android.reddit.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun JoinButton(onClick:(Boolean)->Unit={}){

}

enum class JoinButtonState{
    IDLE,PRESSED
}

@Preview
@Composable
fun JoinButtonPreview(){
    JoinButton(onClick={})
}