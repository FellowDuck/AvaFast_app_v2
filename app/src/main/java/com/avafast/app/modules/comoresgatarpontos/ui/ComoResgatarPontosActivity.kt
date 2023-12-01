package com.avafast.app.modules.comoresgatarpontos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityComoResgatarPontosBinding
import com.avafast.app.modules.avalieeganhepontos.ui.AvalieEGanhePontosActivity
import com.avafast.app.modules.comoresgatarpontos.`data`.viewmodel.ComoResgatarPontosVM
import kotlin.String
import kotlin.Unit

class ComoResgatarPontosActivity :
    BaseActivity<ActivityComoResgatarPontosBinding>(R.layout.activity_como_resgatar_pontos) {
  private val viewModel: ComoResgatarPontosVM by viewModels<ComoResgatarPontosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comoResgatarPontosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVoltar.setOnClickListener {
      val destIntent = AvalieEGanhePontosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMO_RESGATAR_PONTOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ComoResgatarPontosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
