package com.example.cleanarchitecture_shop.data.entity.product

import java.util.*

/**
{
"id": "1",
"createdAt": "2021-04-23T19:44:11.102Z",
"product_name": "Handcrafted Fresh Keyboard",
"product_price": "263.00",
"product_image": "http://lorempixel.com/640/480/technics",
"product": "Bike",
"product_introduction_image": "sdfsdf"
},
 */


data class ProductEntity(
    val id: Long,
    val createdAt: Date,
    val productName: String,
    val productPrice: Int,
    val productImage: String,
    val productType: String,
    val productIntroductionImage: String
    )
