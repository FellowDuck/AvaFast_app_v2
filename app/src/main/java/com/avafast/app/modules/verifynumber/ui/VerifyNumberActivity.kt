package com.avafast.app.modules.verifynumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityVerifyNumberBinding
import com.avafast.app.modules.otpscreen.ui.OtpScreenActivity
import com.avafast.app.modules.verifynumber.`data`.viewmodel.VerifyNumberVM
import kotlin.String
import kotlin.Unit

class VerifyNumberActivity :
    BaseActivity<ActivityVerifyNumberBinding>(R.layout.activity_verify_number) {
  private val viewModel: VerifyNumberVM by viewModels<VerifyNumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verifyNumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnProximo.setOnClickListener {
      val destIntent = OtpScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VERIFY_NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VerifyNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
