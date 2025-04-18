package com.example.test2apps.common.model

data class ChatMessage(
    val text: String,
    val isOutgoing: Boolean,
    val endpointId: String? = null,
    val senderName: String? = null
)