package com.avafast.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityLoginBinding
import com.avafast.app.modules.cadastroback.ui.CadastroBackActivity
import com.avafast.app.modules.login.`data`.viewmodel.LoginVM
import com.avafast.app.modules.verifynumber.ui.VerifyNumberActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private var auth: FirebaseAuth = Firebase.auth

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtEsqueceuasenh.setOnClickListener {
      val destIntent = VerifyNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    //TODO please bind email and password with view
    binding.btnLogin.setOnClickListener {
      val email = ""
      val password = ""
      if(email.isNotEmpty() && password.isNotEmpty()) {
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener { task ->
          if(task.isSuccessful) {
            }else{

          }
        }
      }
    }
    binding.btnVoltar.setOnClickListener {
      val destIntent = CadastroBackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
