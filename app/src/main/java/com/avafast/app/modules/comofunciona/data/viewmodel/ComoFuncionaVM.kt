package com.avafast.app.modules.comofunciona.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.comofunciona.`data`.model.ComoFuncionaModel
import org.koin.core.KoinComponent

class ComoFuncionaVM : ViewModel(), KoinComponent {
  val comoFuncionaModel: MutableLiveData<ComoFuncionaModel> = MutableLiveData(ComoFuncionaModel())

  var navArguments: Bundle? = null
}
