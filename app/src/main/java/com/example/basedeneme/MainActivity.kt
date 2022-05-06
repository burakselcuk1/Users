package com.example.basedeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basedeneme.activities.BaseActivity
import com.example.basedeneme.databinding.ActivityMainBinding
import com.example.basedeneme.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    layoutId = R.layout.activity_main,
    viewModelClass = MainViewModel::class.java
) {
    override fun onInitDataBinding() {
    }

}