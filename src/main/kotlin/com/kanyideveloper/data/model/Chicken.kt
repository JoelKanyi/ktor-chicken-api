package com.kanyideveloper.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Chicken(
    val name: String,
    val description: String,
    val imageUrl: String
)
