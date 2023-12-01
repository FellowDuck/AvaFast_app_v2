package com.avafast.app.modules.sobremim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.sobremim.`data`.model.SobreMimModel
import org.koin.core.KoinComponent

class SobreMimVM : ViewModel(), KoinComponent {
  val sobreMimModel: MutableLiveData<SobreMimModel> = MutableLiveData(SobreMimModel())

  var navArguments: Bundle? = null
}
