package com.example.love5_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.love5_2.Love.LoveModel

class LoveViewModel:ViewModel() {

    val repository = Repository()

    fun liveModel(firstName:String,secondName:String):LiveData<LoveModel>{
        return repository.getLiveLoveModel(firstName,secondName)
    }

}