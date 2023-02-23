package com.example.recylerviewyt.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.recylerviewyt.adapter.MainAdapter
import com.example.recylerviewyt.databinding.FragmentNewsBinding
import com.example.recylerviewyt.models.TextViewModel


class NewsFragment : Fragment() {

    private var binding: FragmentNewsBinding ?= null

    private lateinit var newsAdapter: MainAdapter

    private val textViewModel: TextViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        val newsBinding = FragmentNewsBinding.inflate(inflater, container, false)
        binding = newsBinding
        return newsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsAdapter = MainAdapter(textViewModel)

        binding?.apply {
            primeRecyclerView.adapter = newsAdapter
            newsFragment = this@NewsFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}