package com.avafast.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.login.`data`.model.LoginModel
import com.google.firebase.auth.AuthResult
import org.koin.core.KoinComponent

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())


  var navArguments: Bundle? = null


  lateinit var firebaseSignInAuthResponse: AuthResult
}
