package com.example.basedeneme.ui.userFragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.basedeneme.R

public class UserFragmentDirections private constructor() {
  public companion object {
    public fun actionUserFragmentToPostFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_userFragment_to_postFragment)
  }
}
