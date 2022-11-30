package com.example.love5_2

import com.example.love5_2.Love.LoveFragment
import com.example.love5_2.Love.LoveModel


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.love5_2.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getResult()
    }


    fun getResult(){
        with(binding){
            val all: LoveModel = arguments?.getSerializable(LoveFragment.KEY_FOR_ALL) as LoveModel
            firstName.text = all.firstName
            secondName.text = all.secondName
            percent.text = all.percentage
            tvResult.text = all.result
        }

    }

}