package com.avafast.app.modules.avaliarrestaurante.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.avaliarrestaurante.`data`.model.AvaliarRestauranteModel
import org.koin.core.KoinComponent

class AvaliarRestauranteVM : ViewModel(), KoinComponent {
  val avaliarRestauranteModel: MutableLiveData<AvaliarRestauranteModel> =
      MutableLiveData(AvaliarRestauranteModel())

  var navArguments: Bundle? = null
}
