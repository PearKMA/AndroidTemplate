package com.testarossa.android_template

import android.app.Application
import com.testarossa.template.library.android.ui.BaseApplication
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