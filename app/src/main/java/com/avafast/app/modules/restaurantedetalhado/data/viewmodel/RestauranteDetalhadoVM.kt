package com.avafast.app.modules.restaurantedetalhado.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.restaurantedetalhado.`data`.model.RestauranteDetalhadoModel
import org.koin.core.KoinComponent

class RestauranteDetalhadoVM : ViewModel(), KoinComponent {
  val restauranteDetalhadoModel: MutableLiveData<RestauranteDetalhadoModel> =
      MutableLiveData(RestauranteDetalhadoModel())

  var navArguments: Bundle? = null
}
