package com.example.basedeneme.ui.postFragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/example/basedeneme/ui/postFragment/PostFragmentViewModel;", "Lcom/example/basedeneme/base/BaseViewModel;", "repository", "Lcom/example/basedeneme/repository/UserRepository;", "(Lcom/example/basedeneme/repository/UserRepository;)V", "_post", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/basedeneme/model/PostsItemResponse;", "_statusData", "Lcom/example/basedeneme/common/enums/Status;", "post", "Landroidx/lifecycle/LiveData;", "getPost", "()Landroidx/lifecycle/LiveData;", "statusData", "getStatusData", "", "id", "", "app_debug"})
public final class PostFragmentViewModel extends com.example.basedeneme.base.BaseViewModel {
    private final com.example.basedeneme.repository.UserRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.basedeneme.model.PostsItemResponse> _post = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.basedeneme.model.PostsItemResponse> post = null;
    private androidx.lifecycle.MutableLiveData<com.example.basedeneme.common.enums.Status> _statusData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.basedeneme.common.enums.Status> statusData = null;
    
    @javax.inject.Inject()
    public PostFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.basedeneme.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.basedeneme.model.PostsItemResponse> getPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.basedeneme.common.enums.Status> getStatusData() {
        return null;
    }
    
    public final void getPost(int id) {
    }
}