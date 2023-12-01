package com.avafast.app.modules.comentarios.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityComentariosBinding
import com.avafast.app.modules.comentarios.`data`.model.ComentariosRowModel
import com.avafast.app.modules.comentarios.`data`.viewmodel.ComentariosVM
import com.avafast.app.modules.restaurantedetalhado.ui.RestauranteDetalhadoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComentariosActivity : BaseActivity<ActivityComentariosBinding>(R.layout.activity_comentarios)
    {
  private val viewModel: ComentariosVM by viewModels<ComentariosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val comentariosAdapter =
    ComentariosAdapter(viewModel.comentariosList.value?:mutableListOf())
    binding.recyclerComentarios.adapter = comentariosAdapter
    comentariosAdapter.setOnItemClickListener(
    object : ComentariosAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ComentariosRowModel) {
        onClickRecyclerComentarios(view, position, item)
      }
    }
    )
    viewModel.comentariosList.observe(this) {
      comentariosAdapter.updateData(it)
    }
    binding.comentariosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = RestauranteDetalhadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerComentarios(
    view: View,
    position: Int,
    item: ComentariosRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMENTARIOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ComentariosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
