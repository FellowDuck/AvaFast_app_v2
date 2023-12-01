package com.avafast.app.modules.meusfavoritos.ui

import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityMeusFavoritosBinding
import com.avafast.app.modules.home.ui.HomeActivity
import com.avafast.app.modules.meusfavoritos.`data`.viewmodel.MeusFavoritosVM
import kotlin.String
import kotlin.Unit

class MeusFavoritosActivity :
    BaseActivity<ActivityMeusFavoritosBinding>(R.layout.activity_meus_favoritos) {
  private val viewModel: MeusFavoritosVM by viewModels<MeusFavoritosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meusFavoritosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MEUS_FAVORITOS_ACTIVITY"

  }
}
