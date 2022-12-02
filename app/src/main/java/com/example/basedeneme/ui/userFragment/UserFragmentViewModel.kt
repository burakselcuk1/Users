package com.example.basedeneme.ui.userFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.basedeneme.base.BaseViewModel
import com.example.basedeneme.common.enums.Status
import com.example.basedeneme.model.UsersResponse
import com.example.basedeneme.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserFragmentViewModel @Inject constructor(private val repository: UserRepository): BaseViewModel() {

    private  val _users = MutableLiveData<UsersResponse>()
    val users : LiveData<UsersResponse> = _users

    private var _statusData = MutableLiveData<Status>()
    val statusData: LiveData<Status> = _statusData

    init {
        getUsers()
    }

    fun getUsers() {

        GlobalScope.launch {
            repository.getUsers()
                .catch {
                    _statusData.postValue(Status.ERROR)
                }
                .collect {
                    when (it.status) {
                        Status.LOADING -> {
                            _statusData.postValue(Status.LOADING)
                        }
                        Status.SUCCESS -> {
                            _users.postValue(it.data!!.body())
                            _statusData.postValue(Status.SUCCESS)
                        }
                        Status.ERROR -> {
                            _statusData.postValue(Status.ERROR)
                        }
                    }

                }
        }
    }
}