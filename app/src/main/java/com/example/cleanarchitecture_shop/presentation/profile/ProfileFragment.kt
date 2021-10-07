package com.example.cleanarchitecture_shop.presentation.profile

import com.example.cleanarchitecture_shop.databinding.FragmentProductListBinding
import com.example.cleanarchitecture_shop.databinding.FragmentProfileBinding
import com.example.cleanarchitecture_shop.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class ProfileFragment : BaseFragment<ProfileViewModel, FragmentProfileBinding>() {

    companion object {
        const val TAG = "ProfileFragment"
    }

    override val viewModel by inject<ProfileViewModel>()

    override fun getViewBinding(): FragmentProfileBinding = FragmentProfileBinding.inflate(layoutInflater)

    override fun observeData() {

    }
}