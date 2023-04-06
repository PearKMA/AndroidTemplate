package com.testarossa.android_template.data.repository

import android.location.Location
import com.testarossa.android_template.data.network.NetworkService
import com.testarossa.template.library.android.utils.extension.networkBoundResource
import com.testarossa.template.library.android.utils.network.ConnectivityManagerNetworkMonitor
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.sync.withLock
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository  @Inject constructor(
    networkMonitor: ConnectivityManagerNetworkMonitor,
    private val networkService: NetworkService
//    private val db: AppDatabase
) {
    val isOnline = networkMonitor.isOnline

    fun fetchSomeThing(
        refresh: Boolean,
        onFailure: (Throwable) -> Unit = {}
    ) = networkBoundResource(
        query = {
            flow { emit("") }
        },
        fetch = {
//            val response =
//                networkService.doSomething()
        },
        saveFetchResult = { temp ->

        },
        shouldFetch = {
            refresh
        },
        onFetchSuccess = {},
        onFetchFailed = { t ->
            if (t !is HttpException && t !is IOException) {
                throw t
            }
            onFailure(t)
        }
    )
}