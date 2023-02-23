package com.example.recylerviewyt.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewyt.News
import com.example.recylerviewyt.databinding.ListItemBinding
import com.example.recylerviewyt.models.TextViewModel

class MainAdapter(private val textViewModel: TextViewModel):RecyclerView.Adapter<MainAdapter.MainViewModel>() {

    private lateinit var binding: ListItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewModel {
        val listItemBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding = listItemBinding
        return MainViewModel(listItemBinding)
    }

    override fun onBindViewHolder(holder: MainViewModel, position: Int) = holder.bind(textViewModel.getItemAt(position))


    override fun getItemCount(): Int = textViewModel.getItemCount()

    class MainViewModel(var itemBinding: ListItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bind(currentItem: News){
            itemBinding.news = currentItem
            itemBinding.executePendingBindings()
        }
    }


}