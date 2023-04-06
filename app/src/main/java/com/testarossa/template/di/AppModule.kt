package com.testarossa.template.di

import android.content.Context
import com.testarossa.template.library.utils.network.ConnectivityManagerNetworkMonitor
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(""/*BuildConfig.WEATHER_URL*/)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

   /* @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(app, AppDatabase::class.java, "name")
        .fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun provideDao(db: AppDatabase) = db.nameDao()*/
}