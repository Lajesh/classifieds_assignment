package com.dubizzle.core.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dubizzle.core.arc.SingleLiveEvent

/****
 * Tool bar Property ViewModel
 * Author: Lajesh Dineshkumar
 *****/
class ToolbarPropertyViewModel : ViewModel() {
    var showBack = MutableLiveData<Boolean>(true)
    var showClose = MutableLiveData<Boolean>(false)
    var toolbarTitle = MutableLiveData<String>()
    val closeButtonAction: SingleLiveEvent<Boolean> = SingleLiveEvent()
    val backButtonAction: SingleLiveEvent<Boolean> = SingleLiveEvent()
}
