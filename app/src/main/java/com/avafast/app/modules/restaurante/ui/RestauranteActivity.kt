package com.avafast.app.modules.restaurante.ui

import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityRestauranteBinding
import com.avafast.app.modules.home.ui.HomeActivity
import com.avafast.app.modules.restaurante.`data`.viewmodel.RestauranteVM
import com.avafast.app.modules.restaurantedetalhado.ui.RestauranteDetalhadoActivity
import kotlin.String
import kotlin.Unit

class RestauranteActivity : BaseActivity<ActivityRestauranteBinding>(R.layout.activity_restaurante)
    {
  private val viewModel: RestauranteVM by viewModels<RestauranteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.restauranteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.toolbarToolbar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnvectorTwo.setOnClickListener {
      val destIntent = RestauranteDetalhadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESTAURANTE_ACTIVITY"

  }
}
