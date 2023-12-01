package com.avafast.app.modules.avaliarrestaurante.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityAvaliarRestauranteBinding
import com.avafast.app.modules.avaliacoes.ui.AvaliacoesActivity
import com.avafast.app.modules.avaliarrestaurante.`data`.viewmodel.AvaliarRestauranteVM
import com.avafast.app.modules.comentarios.ui.ComentariosActivity
import kotlin.String
import kotlin.Unit

class AvaliarRestauranteActivity :
    BaseActivity<ActivityAvaliarRestauranteBinding>(R.layout.activity_avaliar_restaurante) {
  private val viewModel: AvaliarRestauranteVM by viewModels<AvaliarRestauranteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avaliarRestauranteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = ComentariosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProximo.setOnClickListener {
      val destIntent = AvaliacoesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AVALIAR_RESTAURANTE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AvaliarRestauranteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
