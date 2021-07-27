package com.dubizzle.data.datasource.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dubizzle.data.datasource.local.dao.BranchDao
import com.dubizzle.data.datasource.local.entity.Branch

/****
 * Application Database
 * Author: Lajesh Dineshkumar
 *****/
@Database(
    entities = [Branch::class],
    version = 1,
    exportSchema = false
)
abstract class AppDb : RoomDatabase() {
    abstract fun branchDao() : BranchDao
}