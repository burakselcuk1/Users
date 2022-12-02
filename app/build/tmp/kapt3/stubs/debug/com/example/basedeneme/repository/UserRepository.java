package com.example.basedeneme.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/basedeneme/repository/UserRepository;", "", "usersApiImple", "Lcom/example/basedeneme/services/ApiImpl;", "(Lcom/example/basedeneme/services/ApiImpl;)V", "getPosts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/basedeneme/common/Resource;", "Lretrofit2/Response;", "Lcom/example/basedeneme/model/PostsItemResponse;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "Lcom/example/basedeneme/model/UsersResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository {
    private final com.example.basedeneme.services.ApiImpl usersApiImple = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.example.basedeneme.services.ApiImpl usersApiImple) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.basedeneme.common.Resource<retrofit2.Response<com.example.basedeneme.model.UsersResponse>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPosts(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.basedeneme.common.Resource<retrofit2.Response<com.example.basedeneme.model.PostsItemResponse>>>> continuation) {
        return null;
    }
}