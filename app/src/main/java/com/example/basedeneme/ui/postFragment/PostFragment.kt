package com.example.basedeneme.ui.postFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basedeneme.R
import com.example.basedeneme.base.BaseFragment
import com.example.basedeneme.databinding.FragmentPostBinding

class PostFragment : BaseFragment<FragmentPostBinding, PostFragmentViewModel>(
    layoutId = R.layout.fragment_post,
    viewModelClass = PostFragmentViewModel::class.java
) {
    override fun onInitDataBinding() {

    }
}