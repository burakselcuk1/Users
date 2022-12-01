package com.example.basedeneme.ui.userFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.basedeneme.base.BaseViewModel
import com.example.basedeneme.model.Users
import com.example.basedeneme.model.UsersItem
import com.example.basedeneme.repository.UserRepository
import com.example.basedeneme.utils.DataFetchResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserFragmentViewModel @Inject constructor(private val repository: UserRepository): BaseViewModel() {

    private  val _users = MutableLiveData<DataFetchResult<Users>>()
    val users : LiveData<DataFetchResult<Users>> = _users

    init {
        getUsers()
    }

    fun getUsers() = viewModelScope.launch {
        repository.getUsers().runCatching {
           // _users.value = DataFetchResult.success(this)
        }
    }
}