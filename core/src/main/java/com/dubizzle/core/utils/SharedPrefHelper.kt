package com.dubizzle.core.utils

import android.content.Context
import android.content.SharedPreferences
import com.dubizzle.core.utils.PreferenceUtil.get
import com.dubizzle.core.utils.PreferenceUtil.set
import com.dubizzle.core.common.SharedPrefConstants

/****
 * Keep all shared preference related methods here
 * Author: Lajesh Dineshkumar
 *****/
class SharedPrefHelper constructor(context: Context) {

    private var sharedPreferences: SharedPreferences =
        PreferenceUtil.customPrefs(context, SharedPrefConstants.APP_PREFS)

    fun getToken(): String? {
        return sharedPreferences[SharedPrefConstants.TOKEN]
    }

    fun setToken(token: String?) {
        sharedPreferences[SharedPrefConstants.TOKEN] = token
    }

}