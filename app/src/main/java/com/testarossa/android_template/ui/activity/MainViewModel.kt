package com.testarossa.android_template.ui.activity

import android.app.Application
import com.testarossa.android_template.data.repository.MainRepository
import com.testarossa.template.library.android.viewmodel.EventAndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    application: Application,
    private val repository: MainRepository
) : EventAndroidViewModel<MainViewModel.Event>(application) {




    sealed class Event {

    }
}