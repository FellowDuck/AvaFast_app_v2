package com.avafast.app.modules.cadastroback.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.cadastroback.`data`.model.CadastroBackModel
import com.google.firebase.auth.AuthResult
import org.koin.core.KoinComponent

class CadastroBackVM : ViewModel(), KoinComponent {
  val cadastroBackModel: MutableLiveData<CadastroBackModel> = MutableLiveData(CadastroBackModel())


  var navArguments: Bundle? = null


  lateinit var firebaseSignUpAuthResponse: AuthResult
}
