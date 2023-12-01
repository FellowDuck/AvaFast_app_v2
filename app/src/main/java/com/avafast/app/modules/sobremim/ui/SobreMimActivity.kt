package com.avafast.app.modules.sobremim.ui

import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivitySobreMimBinding
import com.avafast.app.modules.home.ui.HomeActivity
import com.avafast.app.modules.sobremim.`data`.viewmodel.SobreMimVM
import kotlin.String
import kotlin.Unit

class SobreMimActivity : BaseActivity<ActivitySobreMimBinding>(R.layout.activity_sobre_mim) {
  private val viewModel: SobreMimVM by viewModels<SobreMimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sobreMimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SOBRE_MIM_ACTIVITY"

  }
}
