package com.avafast.app.modules.bemvindo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityBemVindoBinding
import com.avafast.app.modules.bemvindo.`data`.viewmodel.BemVindoVM
import com.avafast.app.modules.comofunciona.ui.ComoFuncionaActivity
import kotlin.String
import kotlin.Unit

class BemVindoActivity : BaseActivity<ActivityBemVindoBinding>(R.layout.activity_bem_vindo) {
  private val viewModel: BemVindoVM by viewModels<BemVindoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bemVindoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = ComoFuncionaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BEM_VINDO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BemVindoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
