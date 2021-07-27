package com.dubizzle.core.common

import android.view.View
import androidx.databinding.BindingAdapter

/*******
 * File Description
 * Author: Lajesh Dineshkumar
 * Created on: 21/07/2021
 * Modified on: 21/07/2021
 ********/
object BindingAdapter {

    /**
     * Setting visibility for Views
     */
    @JvmStatic
    @BindingAdapter("visibility")
    fun setVisibility(
        view: View,
        visibility: Boolean?
    ) {
        if (null != visibility) {
            view.visibility = if (visibility) {
                View.VISIBLE
            } else
                View.GONE
        } else {
            view.visibility = View.GONE
        }
    }
}