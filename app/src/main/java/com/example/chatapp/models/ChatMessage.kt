package com.example.chatapp.models

class ChatMessage(val sender: User, val message: String) {
    constructor(): this(User(), "")
}