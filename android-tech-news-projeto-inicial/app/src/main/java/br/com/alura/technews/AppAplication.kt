package br.com.alura.technews

import android.app.Application
import br.com.alura.technews.di.modules.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppAplication : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@AppAplication)
            modules(appModules)
        }
    }

}