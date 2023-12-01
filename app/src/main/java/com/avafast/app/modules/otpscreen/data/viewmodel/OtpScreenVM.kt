package com.avafast.app.modules.otpscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.otpscreen.`data`.model.OtpScreenModel
import org.koin.core.KoinComponent

class OtpScreenVM : ViewModel(), KoinComponent {
  val otpScreenModel: MutableLiveData<OtpScreenModel> = MutableLiveData(OtpScreenModel())

  var navArguments: Bundle? = null
}
