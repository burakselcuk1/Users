package com.example.basedeneme.ui.userFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basedeneme.R
import com.example.basedeneme.adapter.UserAdapter
import com.example.basedeneme.base.BaseFragment
import com.example.basedeneme.common.enums.Status
import com.example.basedeneme.common.extensions.observe
import com.example.basedeneme.common.extensions.observeEvent
import com.example.basedeneme.common.tryOrLog
import com.example.basedeneme.common.utils.ProgressDialogUtil
import com.example.basedeneme.databinding.FragmentUserBinding


class UserFragment : BaseFragment<FragmentUserBinding, UserFragmentViewModel>(
    layoutId = R.layout.fragment_user,
    viewModelClass = UserFragmentViewModel::class.java
) {

    private lateinit var adapter: UserAdapter

    override fun onInitDataBinding() {
        //getUsers()
        getUserse()
    }

    fun getUsers(){
        viewModel.users.observe(viewLifecycleOwner, Observer {
            binding.progressBar.visibility = View.GONE
            adapter = UserAdapter(it)
            binding.userRecyclerview.layoutManager = LinearLayoutManager(context)
            binding.userRecyclerview.adapter = adapter
        })

    }

    fun getUserse(){
        observeEvent(viewModel.statusData) {
            tryOrLog {
                when (it) {
                    Status.LOADING -> {
                        ProgressDialogUtil.showLoadingProgress(context = requireContext())
                        ProgressDialogUtil.start()
                    }
                    Status.SUCCESS -> {

                        binding.progressBar.visibility = View.GONE

                        observe(viewModel.users){

                            adapter = UserAdapter(it)
                            binding.userRecyclerview.layoutManager = LinearLayoutManager(context)
                            binding.userRecyclerview.adapter = adapter

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