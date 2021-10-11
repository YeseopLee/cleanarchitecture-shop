package com.example.cleanarchitecture_shop.domain.product

import com.example.cleanarchitecture_shop.data.repository.ProductRepository
import com.example.cleanarchitecture_shop.domain.UseCase

internal class DeleteOrderedProductListUseCase(
    private val productRepository: ProductRepository
): UseCase {

    suspend operator fun invoke() {
        return productRepository.deleteAll()
    }
}