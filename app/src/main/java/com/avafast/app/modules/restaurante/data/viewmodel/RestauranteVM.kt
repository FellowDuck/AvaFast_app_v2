package com.avafast.app.modules.restaurante.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.restaurante.`data`.model.RestauranteModel
import org.koin.core.KoinComponent

class RestauranteVM : ViewModel(), KoinComponent {
  val restauranteModel: MutableLiveData<RestauranteModel> = MutableLiveData(RestauranteModel())

  var navArguments: Bundle? = null
}
