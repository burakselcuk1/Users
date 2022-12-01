package com.example.basedeneme.ui.mainActivity

import com.example.basedeneme.R
import com.example.basedeneme.base.BaseActivity
import com.example.basedeneme.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    layoutId = R.layout.activity_main,
    viewModelClass = MainViewModel::class.java
) {
    override fun onInitDataBinding() {
    }
}