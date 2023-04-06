package com.testarossa.template.data.repository

import com.testarossa.template.data.network.NetworkService
import com.testarossa.template.library.utils.extension.networkBoundResource
import com.testarossa.template.library.utils.network.ConnectivityManagerNetworkMonitor
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository  @Inject constructor(
//    networkMonitor: ConnectivityManagerNetworkMonitor,
//    private val networkService: NetworkService
//    private val db: AppDatabase
) {
//    val isOnline = networkMonitor.isOnline

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
        saveFetchResult = {

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