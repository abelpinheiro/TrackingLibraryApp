package com.abelpinheiro.trackinglibraryapp.model

import java.util.*

data class Series(
    val name: String,
    val quantityOwn: Int,
    val quantityTotal: Int,
    val author: String,
    val createdDate: Date,
    val modificationDate: Date,
    val image: Int
) {

}