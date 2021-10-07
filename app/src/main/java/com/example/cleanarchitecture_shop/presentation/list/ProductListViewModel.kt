package com.example.cleanarchitecture_shop.presentation.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture_shop.domain.product.GetProductListUseCase
import com.example.cleanarchitecture_shop.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class ProductListViewModel(
    private val getProductListUseCase: GetProductListUseCase
): BaseViewModel() {

    private var _productListStateLiveData = MutableLiveData<ProductListState>(ProductListState.UnInitialized)
    val productListStateLiveData: LiveData<ProductListState> = _productListStateLiveData

    override fun fetchData(): Job = viewModelScope.launch {
        setState(
            ProductListState.Loading
        )
        setState(
            ProductListState.Success(
                getProductListUseCase()
            )
        )
    }

    private fun setState(state: ProductListState) {
        _productListStateLiveData.postValue(state)
    }
}