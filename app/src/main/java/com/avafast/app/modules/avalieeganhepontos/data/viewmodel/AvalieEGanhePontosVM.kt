package com.avafast.app.modules.avalieeganhepontos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.avalieeganhepontos.`data`.model.AvalieEGanhePontosModel
import org.koin.core.KoinComponent

class AvalieEGanhePontosVM : ViewModel(), KoinComponent {
  val avalieEGanhePontosModel: MutableLiveData<AvalieEGanhePontosModel> =
      MutableLiveData(AvalieEGanhePontosModel())

  var navArguments: Bundle? = null
}
