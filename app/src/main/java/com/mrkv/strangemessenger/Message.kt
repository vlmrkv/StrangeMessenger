package com.mrkv.strangemessenger

data class Message(
    val id: Int,
    val imageResourceId: Int,
    val messageText: String,
    val dateText: String
)