package com.dubizzle.core.config

import com.dubizzle.core.BuildConfig

/****
 * Keep all the common configurations here
 * Author: Lajesh Dineshkumar
 *****/
object Configuration {
    // Deployment Types
    private const val DEV = "dev"
    private const val SIT = "sit"
    private const val UAT = "uat"
    private const val PROD = "prod"
    private const val PILOT = "pilot"

    // Host URLs
    private const val DEV_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/"
    private const val SIT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/sit/"
    private const val UAT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/uat/"
    private const val PROD_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/prod/"
    private const val PILOT_URL = "https://ey3f2y0nre.execute-api.us-east-1.amazonaws.com/pilot/"

    const val CONNECT_TIMEOUT: Long = 60
    const val READ_TIMEOUT: Long = 60
    const val CALL_TIMEOUT: Long = 60


    val baseURL: String
        get() {

            return when (BuildConfig.FLAVOR) {

                DEV -> DEV_URL

                SIT -> SIT_URL

                UAT -> UAT_URL

                PROD -> PROD_URL

                PILOT -> PILOT_URL

                else -> DEV_URL
            }
        }
}
