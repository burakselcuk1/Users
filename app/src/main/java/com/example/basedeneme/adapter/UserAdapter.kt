package com.example.basedeneme.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basedeneme.databinding.UsersItemBinding
import com.example.basedeneme.model.UsersItemResponse
import com.example.basedeneme.model.UsersResponse


class UserAdapter(private val dataSet: UsersResponse) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private lateinit var binding: UsersItemBinding

    class ViewHolder(view: UsersItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = UsersItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val usersResponse: UsersItemResponse = dataSet.get(position)
        binding.usersInformation = usersResponse

        /*val url = POSTER_MAIN_URL + dataSet[position].poster_path
        viewHolder.itemView.apply {
            Glide.with(this).load(url).into(viewHolder.itemView.movieImage)
        }*/
    }
    override fun getItemCount() = dataSet.size

}