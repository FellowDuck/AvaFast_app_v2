package com.avafast.app.modules.comofunciona.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityComoFuncionaBinding
import com.avafast.app.modules.avalieeganhepontos.ui.AvalieEGanhePontosActivity
import com.avafast.app.modules.bemvindo.ui.BemVindoActivity
import com.avafast.app.modules.comofunciona.`data`.viewmodel.ComoFuncionaVM
import kotlin.String
import kotlin.Unit

class ComoFuncionaActivity :
    BaseActivity<ActivityComoFuncionaBinding>(R.layout.activity_como_funciona) {
  private val viewModel: ComoFuncionaVM by viewModels<ComoFuncionaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comoFuncionaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = BemVindoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = AvalieEGanhePontosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMO_FUNCIONA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ComoFuncionaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
