package com.abelpinheiro.trackinglibraryapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abelpinheiro.trackinglibraryapp.adapter.ItemAdapter
import com.abelpinheiro.trackinglibraryapp.data.Datasource
import com.abelpinheiro.trackinglibraryapp.databinding.FragmentSeriesListBinding

class SeriesListFragment : Fragment() {
    private var _binding: FragmentSeriesListBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private val myDataset = Datasource().loadSeries()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSeriesListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ItemAdapter(requireContext(), myDataset)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}