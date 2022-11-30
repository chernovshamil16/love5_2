package com.example.love5_2.Love

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.love5_2.LoveViewModel
import com.example.love5_2.R
import com.example.love5_2.databinding.FragmentLoveBinding

class LoveFragment : Fragment() {

    private lateinit var binding: FragmentLoveBinding
    val viewModel: LoveViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentLoveBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers(){
        with(binding){
            btnCalculate.setOnClickListener {
                viewModel.liveModel(firstEt.text.toString(),secondEt.text.toString()).observe(viewLifecycleOwner,
                    Observer {
                        val all = it
                        val bundle = Bundle()
                        bundle.putSerializable(KEY_FOR_ALL, all)
                        findNavController().navigate(R.id.secondFragment,bundle)
                    })

            }
        }
    }

    companion object{
        const val KEY_FOR_ALL = "key_all"
    }

}