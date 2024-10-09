package com.example.latihan2_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.latihan2_navigation.databinding.FragmentCategoryBinding
import com.example.latihan2_navigation.databinding.FragmentHomeBinding

class CategoryFragment : Fragment() {

    private var _binding :FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private lateinit var btnLifestyle : Button

    companion object{
        val EXTRA_NAME = "extra_name"
        val EXTRA_STOCK = "extra_stock"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        btnLifestyle = view.findViewById(R.id.btn_lifestyle)
//        with bundle
//        binding.btnLifestyle.setOnClickListener{
//            view ->
//            val bundle = Bundle()
//            bundle.putString(EXTRA_NAME, "Lifestyle")
//            bundle.putLong(EXTRA_STOCK, 7)
//            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment,bundle)
//        }

//        safe args
        binding.btnLifestyle.setOnClickListener{view ->
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "lifeStyle"
            toDetailCategoryFragment.stock = 10
            view.findNavController().navigate(toDetailCategoryFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}