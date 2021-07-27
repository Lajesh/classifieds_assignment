package com.dubizzle.data.datasource.local.database;

import java.lang.System;

/**
 * **
 * Application Database
 * Author: Lajesh Dineshkumar
 */
@androidx.room.Database(entities = {com.dubizzle.data.datasource.local.entity.Branch.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/dubizzle/data/datasource/local/database/AppDb;", "Landroidx/room/RoomDatabase;", "()V", "branchDao", "Lcom/dubizzle/data/datasource/local/dao/BranchDao;", "data_debug"})
public abstract class AppDb extends androidx.room.RoomDatabase {
    
    public AppDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dubizzle.data.datasource.local.dao.BranchDao branchDao();
}