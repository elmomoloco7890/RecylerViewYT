package com.example.recylerviewyt.models

import androidx.lifecycle.ViewModel
import com.example.recylerviewyt.News

class TextViewModel: ViewModel() {

    private var repository = NewsRepository()

    private var newsListArray = repository.getInitialData()

    fun getItemAt(position: Int): News{
        return newsListArray[position]
    }

    fun getItemCount(): Int {
        return newsListArray.size
    }

}