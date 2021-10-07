package com.example.cleanarchitecture_shop.presentation.list

import com.example.cleanarchitecture_shop.data.entity.product.ProductEntity

internal sealed class ProductListState {

    object UnInitialized: ProductListState()

    object Loading: ProductListState()

    data class Success(
        val productList: List<ProductEntity>
    ): ProductListState()

    object Error: ProductListState()

}