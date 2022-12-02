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
import com.example.basedeneme.databinding.FragmentUserBinding
import com.example.basedeneme.utils.DataFetchResult


class UserFragment : BaseFragment<FragmentUserBinding, UserFragmentViewModel>(
    layoutId = R.layout.fragment_user,
    viewModelClass = UserFragmentViewModel::class.java
) {

    private lateinit var adapter: UserAdapter

    override fun onInitDataBinding() {
        getUsers()
    }

    fun getUsers(){
        viewModel.users.observe(viewLifecycleOwner, Observer {
            binding.progressBar.visibility = View.GONE
            adapter = UserAdapter(it)
            binding.userRecyclerview.layoutManager = LinearLayoutManager(context)
            binding.userRecyclerview.adapter = adapter
        })
    }
}