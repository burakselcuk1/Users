package com.example.basedeneme.ui.userFragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/basedeneme/ui/userFragment/UserFragmentViewModel;", "Lcom/example/basedeneme/base/BaseViewModel;", "repository", "Lcom/example/basedeneme/repository/UserRepository;", "(Lcom/example/basedeneme/repository/UserRepository;)V", "_users", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/basedeneme/utils/DataFetchResult;", "Lcom/example/basedeneme/model/Users;", "users", "Landroidx/lifecycle/LiveData;", "getUsers", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class UserFragmentViewModel extends com.example.basedeneme.base.BaseViewModel {
    private final com.example.basedeneme.repository.UserRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.basedeneme.utils.DataFetchResult<com.example.basedeneme.model.Users>> _users = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.basedeneme.utils.DataFetchResult<com.example.basedeneme.model.Users>> users = null;
    
    @javax.inject.Inject()
    public UserFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basedeneme.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.basedeneme.utils.DataFetchResult<com.example.basedeneme.model.Users>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getUsers() {
        return null;
    }
}