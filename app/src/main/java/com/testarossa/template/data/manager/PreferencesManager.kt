package com.testarossa.template.data.manager

import android.content.Context
import com.testarossa.template.library.data.manager.BaseDataStoreManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesManager @Inject constructor(@ApplicationContext context: Context) :
    BaseDataStoreManager(context) {

    /*val showGuideFlow = PreferencesKeys.SHOW_GUIDE.watchValue(true)

    suspend fun disableShowGuide() {
        PreferencesKeys.SHOW_GUIDE.setValue(false)
    }

    private object PreferencesKeys {
        val SHOW_GUIDE = booleanPreferencesKey("SHOW_GUIDE")
    }*/
}