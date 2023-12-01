package com.avafast.app.modules.bemvindo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.bemvindo.`data`.model.BemVindoModel
import org.koin.core.KoinComponent

class BemVindoVM : ViewModel(), KoinComponent {
  val bemVindoModel: MutableLiveData<BemVindoModel> = MutableLiveData(BemVindoModel())

  var navArguments: Bundle? = null
}
