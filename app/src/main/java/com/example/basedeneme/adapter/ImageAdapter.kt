package com.example.basedeneme.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

@BindingAdapter("url")
fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}