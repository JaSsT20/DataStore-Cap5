package com.levid.chapter3_datastore.di

import com.levid.chapter3_datastore.data.DataStoreManager
import com.levid.chapter3_datastore.data.DataStoreManagerImpl
import com.levid.chapter3_datastore.service.TaskService
import com.levid.chapter3_datastore.service.TaskServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataStoreManagerModule {

    @Singleton
    @Binds
    abstract fun bindDataStoreRepository(dataStoreManagerImpl: DataStoreManagerImpl): DataStoreManager

    @Singleton
    @Binds
    abstract fun bindTaskService(taskServiceImpl: TaskServiceImpl): TaskService
}