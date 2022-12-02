package com.example.basedeneme.ui.postFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.basedeneme.R
import com.example.basedeneme.adapter.UserAdapter
import com.example.basedeneme.base.BaseFragment
import com.example.basedeneme.common.enums.Status
import com.example.basedeneme.common.extensions.observe
import com.example.basedeneme.common.extensions.observeEvent
import com.example.basedeneme.common.tryOrLog
import com.example.basedeneme.common.utils.ProgressDialogUtil
import com.example.basedeneme.databinding.FragmentPostBinding

class PostFragment : BaseFragment<FragmentPostBinding, PostFragmentViewModel>(
    layoutId = R.layout.fragment_post,
    viewModelClass = PostFragmentViewModel::class.java
) {

    override fun onInitDataBinding() {

        val args = this.arguments
        val userId: String? = args?.getString("userId","databoss")

        if (userId != null) {
            viewModel.getPost(userId.toInt())
        }

        getDetailInformations()

    }

    private fun getDetailInformations() {
        observeEvent(viewModel.statusData) {
            tryOrLog {
                when (it) {
                    Status.LOADING -> {
                        ProgressDialogUtil.showLoadingProgress(context = requireContext())
                        ProgressDialogUtil.start()
                    }
                    Status.SUCCESS -> {

                        observe(viewModel.post){

                            binding.postsInformation = it
                            val args = this.arguments
                            val userUrl: String? = args?.getString("userUrl","databoss")
                            Glide.with(this).load(userUrl).into(binding.postBackgroundImage)
                        }
                        ProgressDialogUtil.stop()
                    }
                    Status.ERROR -> {
                        ProgressDialogUtil.stop()
                    }
                }
            }
        }
    }
}