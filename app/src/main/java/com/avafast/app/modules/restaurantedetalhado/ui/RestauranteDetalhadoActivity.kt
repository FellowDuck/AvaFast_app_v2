package com.avafast.app.modules.restaurantedetalhado.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityRestauranteDetalhadoBinding
import com.avafast.app.modules.comentarios.ui.ComentariosActivity
import com.avafast.app.modules.home.ui.HomeActivity
import com.avafast.app.modules.restaurantedetalhado.`data`.viewmodel.RestauranteDetalhadoVM
import kotlin.String
import kotlin.Unit

class RestauranteDetalhadoActivity :
    BaseActivity<ActivityRestauranteDetalhadoBinding>(R.layout.activity_restaurante_detalhado) {
  private val viewModel: RestauranteDetalhadoVM by viewModels<RestauranteDetalhadoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.restauranteDetalhadoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRatingsReviews.setOnClickListener {
      val destIntent = ComentariosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESTAURANTE_DETALHADO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RestauranteDetalhadoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
