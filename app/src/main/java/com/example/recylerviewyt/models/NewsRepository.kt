package com.example.recylerviewyt.models

import com.example.recylerviewyt.News
import com.example.recylerviewyt.R

class NewsRepository {

    private lateinit var imageId: Array<Int>
    private lateinit var heading: Array<String>

    fun getInitialData(): ArrayList<News>{
        val newsListArray: ArrayList<News> = ArrayList()
        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
        )

        heading = arrayOf(
            "Biden aims to expand vaccines for adults and children",
            "Just got my first shot, helping the world to be a safer place",
            "Local trains to be suspended in Bengal from tomorrow in view of covid-19",
            "MHA asks states,UTs to ensure there are no fires in hospitals",
            "Australian citizen sues PM Morrison over flight ban from india",
            "Former India hockey coach Kaushik hospitalised after testing positive for COVID",
            "Delhi records 20,960 fresh covid-19 infections, positivity rate at 26.37%",
            "Barcelona church offers open-air space for Ramadan",
            "Trillions of cicadas set to emerge in the US, here\'s why",
            "Homemaker, economist: Candidates from all walks of life in Bengal assembly",
            "Homemaker, economist: Candidates from all walks of life in Bengal assembly"
        )

        for(i in imageId.indices){
            newsListArray.add(News(imageId[i], heading[i]))
        }

        return newsListArray

    }




}