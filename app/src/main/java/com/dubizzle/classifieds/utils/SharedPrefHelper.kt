package com.dubizzle.classifieds.utils

import android.content.SharedPreferences
import com.dubizzle.classifieds.ClassifiedsApp
import com.dubizzle.classifieds.utils.PreferenceUtil.get
import com.dubizzle.core.common.SharedPrefConstants

/****
 * Keep all shared preference related methods here
 * Author: Lajesh Dineshkumar
 *****/
class SharedPrefHelper {

    private var sharedPreferences: SharedPreferences =
        PreferenceUtil.customPrefs(ClassifiedsApp.applicationContext(), SharedPrefConstants.APP_PREFS)

    fun getToken(): String? {
        return sharedPreferences[SharedPrefConstants.TOKEN]
    }

    fun getCurrentLocale(): LocaleManager.LocaleInfo? {
        return LocaleManager.getCurrentLocaleInfo(ClassifiedsApp.localeContext())
    }
}