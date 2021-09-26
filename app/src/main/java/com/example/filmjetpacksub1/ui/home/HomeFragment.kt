package com.example.filmjetpacksub1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.filmjetpacksub1.databinding.FragmentHomeBinding
import com.example.filmjetpacksub1.viewmodel.HomeViewModel
import com.example.filmjetpacksub1.viewmodel.ViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel
    private var pos: Int = 0
    private var rvAdapter = HomeAdapter()

    companion object {
        const val POSITION = "position"

        @JvmStatic
        fun newInstance(position: Int) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION, position)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        showLoading(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory()
        homeViewModel = ViewModelProvider(
            this, factory
        ).get(HomeViewModel::class.java)

        pos = arguments?.getInt(POSITION, 0) ?: 0
        initialiseRecyclerView()
    }

    private fun initialiseRecyclerView() {
        with(binding.rvHome) {
            setHasFixedSize(true)
            layoutManager =
                GridLayoutManager(activity, 2)
            adapter = rvAdapter
        }
        generateData()
    }

    private fun generateData() {
        when (pos) {
            0 -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val listFilm = homeViewModel.getFilm()
                    withContext(Dispatchers.Main) {
                        rvAdapter.setData(listFilm, pos)
                        rvAdapter.notifyDataSetChanged()
                        showLoading(false)
                    }
                }
            }
            1 -> {
                CoroutineScope(Dispatchers.IO).launch {
                    val listShows = homeViewModel.getTvShows()
                    withContext(Dispatchers.Main) {
                        rvAdapter.setData(listShows, pos)
                        rvAdapter.notifyDataSetChanged()
                        showLoading(false)
                    }
                }
            }
        }
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.INVISIBLE
        }
    }
}