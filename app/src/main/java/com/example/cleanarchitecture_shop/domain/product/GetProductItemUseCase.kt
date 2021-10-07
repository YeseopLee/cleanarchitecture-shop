package com.example.cleanarchitecture_shop.domain.product

import com.example.cleanarchitecture_shop.data.entity.product.ProductEntity
import com.example.cleanarchitecture_shop.data.repository.ProductRepository
import com.example.cleanarchitecture_shop.domain.UseCase

internal class GetProductItemUseCase(
    private val productRepository: ProductRepository
): UseCase {

    suspend operator fun invoke(productId: Long): ProductEntity? {
        return productRepository.getProductItem(productId)
    }

}
