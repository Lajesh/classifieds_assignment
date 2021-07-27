package com.dubizzle.data.datasource.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/****
 * Branch model
 * Author: Lajesh Dineshkumar
 *****/
@Entity(tableName = "branches")
data class Branch(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val branchName: String? = "",

    val branchAddress: String? = ""
)
