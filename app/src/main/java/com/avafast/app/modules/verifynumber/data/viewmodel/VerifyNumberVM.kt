package com.avafast.app.modules.verifynumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.verifynumber.`data`.model.VerifyNumberModel
import org.koin.core.KoinComponent

class VerifyNumberVM : ViewModel(), KoinComponent {
  val verifyNumberModel: MutableLiveData<VerifyNumberModel> = MutableLiveData(VerifyNumberModel())

  var navArguments: Bundle? = null
}
