package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Note(
    var id: Int,
    var title: String,
    var priority: Priority,
    var description: String
)
