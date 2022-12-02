package com.example.basedeneme.ui.userFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.basedeneme.base.BaseViewModel
import com.example.basedeneme.model.UsersResponse
import com.example.basedeneme.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserFragmentViewModel @Inject constructor(private val repository: UserRepository): BaseViewModel() {

    private  val _users = MutableLiveData<UsersResponse>()
    val users : LiveData<UsersResponse> = _users

    init {
        getUsers()
    }

    fun getUsers()=GlobalScope.launch {
        repository.getUsers().let {
            _users.postValue( it.body()!! )
        }
    }
}