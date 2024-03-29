package com.testarossa.template.library.data.local

import androidx.room.*

interface IBaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg obj: T): LongArray

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: T): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertOrIgnore(obj: T): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(obj: T)

    @Delete
    suspend fun delete(obj: T)
}

@Transaction
suspend inline fun <reified T> IBaseDao<T>.insertOrUpdate(item: T) {
    if (insertOrIgnore(item) != -1L) return
    update(item)
}
