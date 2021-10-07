package com.example.cleanarchitecture_shop

import android.app.Application
import com.example.cleanarchitecture_shop.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApp: Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MyApp)
            modules(appModule)
        }

    }
}