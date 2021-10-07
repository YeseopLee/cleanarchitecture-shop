package com.example.cleanarchitecture_shop.presentation.main

import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture_shop.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class MainViewModel: BaseViewModel() {
    override fun fetchData(): Job = viewModelScope.launch {  }
}