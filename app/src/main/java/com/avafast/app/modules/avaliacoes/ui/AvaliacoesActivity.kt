package com.avafast.app.modules.avaliacoes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityAvaliacoesBinding
import com.avafast.app.modules.avaliacoes.`data`.model.AvaliacoesRowModel
import com.avafast.app.modules.avaliacoes.`data`.viewmodel.AvaliacoesVM
import com.avafast.app.modules.home.ui.HomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AvaliacoesActivity : BaseActivity<ActivityAvaliacoesBinding>(R.layout.activity_avaliacoes) {
  private val viewModel: AvaliacoesVM by viewModels<AvaliacoesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val avaliacoesAdapter = AvaliacoesAdapter(viewModel.avaliacoesList.value?:mutableListOf())
    binding.recyclerAvaliacoes.adapter = avaliacoesAdapter
    avaliacoesAdapter.setOnItemClickListener(
    object : AvaliacoesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AvaliacoesRowModel) {
        onClickRecyclerAvaliacoes(view, position, item)
      }
    }
    )
    viewModel.avaliacoesList.observe(this) {
      avaliacoesAdapter.updateData(it)
    }
    binding.avaliacoesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerAvaliacoes(
    view: View,
    position: Int,
    item: AvaliacoesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "AVALIACOES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AvaliacoesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
