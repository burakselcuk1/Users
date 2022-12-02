package com.example.basedeneme.ui.userFragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/basedeneme/ui/userFragment/UserFragmentViewModel;", "Lcom/example/basedeneme/base/BaseViewModel;", "repository", "Lcom/example/basedeneme/repository/UserRepository;", "(Lcom/example/basedeneme/repository/UserRepository;)V", "_statusData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/basedeneme/common/enums/Status;", "_users", "Lcom/example/basedeneme/model/UsersResponse;", "statusData", "Landroidx/lifecycle/LiveData;", "getStatusData", "()Landroidx/lifecycle/LiveData;", "users", "getUsers", "", "app_debug"})
public final class UserFragmentViewModel extends com.example.basedeneme.base.BaseViewModel {
    private final com.example.basedeneme.repository.UserRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.basedeneme.model.UsersResponse> _users = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.basedeneme.model.UsersResponse> users = null;
    private androidx.lifecycle.MutableLiveData<com.example.basedeneme.common.enums.Status> _statusData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.basedeneme.common.enums.Status> statusData = null;
    
    @javax.inject.Inject()
    public UserFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basedeneme.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.basedeneme.model.UsersResponse> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.basedeneme.common.enums.Status> getStatusData() {
        return null;
    }
    
    public final void getUsers() {
    }
}