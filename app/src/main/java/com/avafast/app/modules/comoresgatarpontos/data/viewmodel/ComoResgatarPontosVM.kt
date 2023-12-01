package com.avafast.app.modules.comoresgatarpontos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.comoresgatarpontos.`data`.model.ComoResgatarPontosModel
import org.koin.core.KoinComponent

class ComoResgatarPontosVM : ViewModel(), KoinComponent {
  val comoResgatarPontosModel: MutableLiveData<ComoResgatarPontosModel> =
      MutableLiveData(ComoResgatarPontosModel())

  var navArguments: Bundle? = null
}
