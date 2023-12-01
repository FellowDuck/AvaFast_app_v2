package com.avafast.app.modules.categoria.ui

import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityCategoriaBinding
import com.avafast.app.modules.categoria.`data`.viewmodel.CategoriaVM
import com.avafast.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class CategoriaActivity : BaseActivity<ActivityCategoriaBinding>(R.layout.activity_categoria) {
  private val viewModel: CategoriaVM by viewModels<CategoriaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.toolbarToolbar.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CATEGORIA_ACTIVITY"

  }
}
