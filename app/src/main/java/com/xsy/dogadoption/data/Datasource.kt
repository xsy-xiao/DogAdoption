package com.xsy.dogadoption.data

import com.xsy.dogadoption.R
import com.xsy.dogadoption.model.Dog

class Datasource {
    fun loadDogs(): List<Dog>{
        return listOf<Dog>(
            Dog(R.string.dog1, R.drawable.image1, R.string.detail1),
            Dog(R.string.dog2, R.drawable.image2, R.string.detail2),
            Dog(R.string.dog3, R.drawable.image3, R.string.detail3),
            Dog(R.string.dog4, R.drawable.image4, R.string.detail4),
            Dog(R.string.dog5, R.drawable.image5, R.string.detail5),
            Dog(R.string.dog6, R.drawable.image6, R.string.detail6),
            Dog(R.string.dog7, R.drawable.image7, R.string.detail7),
            Dog(R.string.dog8, R.drawable.image8, R.string.detail8),
            Dog(R.string.dog9, R.drawable.image9, R.string.detail9),
            Dog(R.string.dog10, R.drawable.image10, R.string.detail10)
        )
    }
}