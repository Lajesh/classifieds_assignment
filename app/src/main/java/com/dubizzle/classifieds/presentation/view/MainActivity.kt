package com.dubizzle.classifieds.presentation.view


import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.dubizzle.classifieds.R
import com.dubizzle.classifieds.databinding.ActivityMainBinding
import com.dubizzle.classifieds.BR
import com.dubizzle.core.ui.base.BaseActivity


class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(MainViewModel::class){
    override val layoutRes: Int
        get() = R.layout.activity_main
    override val bindingVariable: Int
        get() = BR.viewModel

    override fun getViewModel(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NavigationUI.setupActionBarWithNavController(this,
            Navigation.findNavController(this, R.id.fragment_container_view));
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.fragment_container_view).navigateUp()
    }
}