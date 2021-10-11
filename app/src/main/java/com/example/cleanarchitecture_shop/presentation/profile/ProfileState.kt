package com.example.cleanarchitecture_shop.presentation.profile

import android.net.Uri
import com.example.cleanarchitecture_shop.data.entity.product.ProductEntity

internal sealed class ProfileState {

    object UnInitialized: ProfileState()

    object Loading: ProfileState()

    data class Login(
        val idToken: String
    ): ProfileState()

    sealed class Success: ProfileState() {

        data class Registered(
            val userName: String,
            val profileImgUri: Uri?,
            val productList: List<ProductEntity> = listOf()
        ): Success()

        object NotRegistered: Success()

    }

    object Error: ProfileState()

}
