package com.example.cleanarchitecture_shop.di

import com.example.cleanarchitecture_shop.data.network.buildOkHttpClient
import com.example.cleanarchitecture_shop.data.network.provideGsonConverterFactory
import com.example.cleanarchitecture_shop.data.network.provideProductApiService
import com.example.cleanarchitecture_shop.data.network.provideProductRetrofit
import com.example.cleanarchitecture_shop.data.repository.DefaultProductRepository
import com.example.cleanarchitecture_shop.data.repository.ProductRepository
import com.example.cleanarchitecture_shop.domain.product.GetProductItemUseCase
import com.example.cleanarchitecture_shop.domain.product.GetProductListUseCase
import com.example.cleanarchitecture_shop.presentation.list.ProductListViewModel
import com.example.cleanarchitecture_shop.presentation.main.MainViewModel
import com.example.cleanarchitecture_shop.presentation.profile.ProfileViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {

    // ViewModels
    viewModel { MainViewModel() }
    viewModel { ProductListViewModel(get()) }
    viewModel { ProfileViewModel() }

    // Coroutine Dispatcher
    single { Dispatchers.Main }
    single { Dispatchers.IO }

    // Repository
    single<ProductRepository> { DefaultProductRepository(get(), get()) }

    // UseCases
    factory { GetProductItemUseCase(get()) }
    factory { GetProductListUseCase(get()) }

    single { provideGsonConverterFactory() }

    single { buildOkHttpClient() }

    single { provideProductRetrofit(get(), get()) }

    single { provideProductApiService(get())}

}