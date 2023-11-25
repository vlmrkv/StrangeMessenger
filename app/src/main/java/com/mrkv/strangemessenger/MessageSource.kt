package com.mrkv.strangemessenger

class MessageSource {
    fun loadMessages(): List<Message> {
        return listOf(
            Message(0, R.drawable.user_image_1, R.string.message1.toString(), R.string.date1.toString()),
            Message(1, R.drawable.user_image_1, R.string.message2.toString(), R.string.date1.toString()),
            Message(1, R.drawable.user_image_1, R.string.message3.toString(), R.string.date1.toString()),
            Message(0, R.drawable.user_image_1, R.string.message4.toString(), R.string.date1.toString()),
            Message(0, R.drawable.user_image_1, R.string.message5.toString(), R.string.date1.toString()),
            Message(1, R.drawable.user_image_1, R.string.message6.toString(), R.string.date1.toString()),
            Message(1, R.drawable.user_image_1, R.string.message7.toString(), R.string.date1.toString()),
            Message(1, R.drawable.user_image_1, R.string.message8.toString(), R.string.date1.toString()),
            Message(0, R.drawable.user_image_1, R.string.message9.toString(), R.string.date1.toString()),
            Message(0, R.drawable.user_image_1, R.string.message10.toString(), R.string.date1.toString())
        )
    }
}