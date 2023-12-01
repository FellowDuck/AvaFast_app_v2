package com.avafast.app.modules.avalieeganhepontos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityAvalieEGanhePontosBinding
import com.avafast.app.modules.avalieeganhepontos.`data`.viewmodel.AvalieEGanhePontosVM
import com.avafast.app.modules.comofunciona.ui.ComoFuncionaActivity
import com.avafast.app.modules.comoresgatarpontos.ui.ComoResgatarPontosActivity
import kotlin.String
import kotlin.Unit

class AvalieEGanhePontosActivity :
    BaseActivity<ActivityAvalieEGanhePontosBinding>(R.layout.activity_avalie_e_ganhe_pontos) {
  private val viewModel: AvalieEGanhePontosVM by viewModels<AvalieEGanhePontosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avalieEGanhePontosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = ComoResgatarPontosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVoltar.setOnClickListener {
      val destIntent = ComoFuncionaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AVALIE_E_GANHE_PONTOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AvalieEGanhePontosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
