package com.work.weatherforecast

import adapters.WeatherModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() { //Данные
    val liveDataCurrent = MutableLiveData<WeatherModel>() //Погода сегодня/Сейчас
    val liveDataList = MutableLiveData<List<WeatherModel>>() //Список погоды на ближайшие дни.
}