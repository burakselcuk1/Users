// Generated by data binding compiler. Do not edit!
package com.example.basedeneme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.basedeneme.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUserBinding extends ViewDataBinding {
  @NonNull
  public final ContentLoadingProgressBar progressBar;

  @NonNull
  public final RecyclerView userRecyclerview;

  protected FragmentUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ContentLoadingProgressBar progressBar, RecyclerView userRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
    this.userRecyclerview = userRecyclerview;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserBinding>inflateInternal(inflater, R.layout.fragment_user, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserBinding>inflateInternal(inflater, R.layout.fragment_user, null, false, component);
  }

  public static FragmentUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserBinding)bind(component, view, R.layout.fragment_user);
  }
}
