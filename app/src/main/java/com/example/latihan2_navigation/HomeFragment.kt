package com.example.latihan2_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.latihan2_navigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding :FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var btnProfile : Button
    private lateinit var btnCategory : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCategory = view.findViewById(R.id.btn_category)
        btnProfile = view.findViewById(R.id.btn_profile)


        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        )

        binding.btnProfile.setOnClickListener{
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}