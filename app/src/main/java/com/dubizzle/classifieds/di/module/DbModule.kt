package com.dubizzle.classifieds.di.module

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.dubizzle.classifieds.ClassifiedsApp
import com.dubizzle.data.datasource.local.database.AppDb
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/****
 * Database Module
 * Author: Lajesh Dineshkumar
 *****/
object DbModule {
    fun load() {
        loadKoinModules(dbModules )
    }

    private val dbModules = module {

        single {
            Room.databaseBuilder(
                ClassifiedsApp.applicationContext(), AppDb::class.java, "cleanapp.db"
            ).allowMainThreadQueries()
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onDestructiveMigration(db: SupportSQLiteDatabase) {
                        // Clear data
                    }
                })
                // Clear DB while upgrade or downgrade
                .fallbackToDestructiveMigration()
                .build()
        }

        single {
            get<AppDb>().branchDao()
        }


    }
}