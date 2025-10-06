package com.samuel.lab_week_06.model

import com.samuel.lab_week_06.model.CatBreed
import com.samuel.lab_week_06.model.Gender

data class CatModel(
    val gender: Gender,
    val breed: CatBreed,
    val name: String,
    val biography: String,
    val imageUrl: String
)

