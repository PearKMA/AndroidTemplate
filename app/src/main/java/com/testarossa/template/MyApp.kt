package com.testarossa.template

import android.app.Application
import com.testarossa.template.library.ui.BaseApplication
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MyApp : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }


    companion object {
        @Volatile
        lateinit var instance: MyApp

        @JvmStatic
        fun getAppInstance(): Application = instance

        @JvmStatic
        fun getCache() = simpleCache
    }

}