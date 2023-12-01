package com.avafast.app.modules.cadastroback.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityCadastroBackBinding
import com.avafast.app.modules.cadastroback.`data`.viewmodel.CadastroBackVM
import com.avafast.app.modules.login.ui.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlin.String
import kotlin.Unit

class CadastroBackActivity :
    BaseActivity<ActivityCadastroBackBinding>(R.layout.activity_cadastro_back) {
  private val viewModel: CadastroBackVM by viewModels<CadastroBackVM>()

  private var auth: FirebaseAuth = Firebase.auth


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cadastroBackVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCriarConta.setOnClickListener {
      val email = ""
      val password = ""
      if(email.isNotEmpty() && password.isNotEmpty()) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
          if(task.isSuccessful) {
          } else {

          }
        }
      }
    }
    binding.btnJTemLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CADASTRO_BACK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CadastroBackActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
