package com.avafast.app.modules.comentariosone.ui

import android.view.View
import androidx.activity.viewModels
import com.avafast.app.R
import com.avafast.app.appcomponents.base.BaseActivity
import com.avafast.app.databinding.ActivityComentariosOneBinding
import com.avafast.app.modules.avaliarrestaurante.ui.AvaliarRestauranteActivity
import com.avafast.app.modules.comentariosone.`data`.model.ListellipseeighteenRowModel
import com.avafast.app.modules.comentariosone.`data`.viewmodel.ComentariosOneVM
import com.avafast.app.modules.restaurantedetalhado.ui.RestauranteDetalhadoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComentariosOneActivity :
    BaseActivity<ActivityComentariosOneBinding>(R.layout.activity_comentarios_one) {
  private val viewModel: ComentariosOneVM by viewModels<ComentariosOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseeighteenAdapter =
    ListellipseeighteenAdapter(viewModel.listellipseeighteenList.value?:mutableListOf())
    binding.recyclerListellipseeighteen.adapter = listellipseeighteenAdapter
    listellipseeighteenAdapter.setOnItemClickListener(
    object : ListellipseeighteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseeighteenRowModel) {
        onClickRecyclerListellipseeighteen(view, position, item)
      }
    }
    )
    viewModel.listellipseeighteenList.observe(this) {
      listellipseeighteenAdapter.updateData(it)
    }
    binding.comentariosOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowright.setOnClickListener {
      val destIntent = RestauranteDetalhadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageAddOne.setOnClickListener {
      val destIntent = AvaliarRestauranteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListellipseeighteen(
    view: View,
    position: Int,
    item: ListellipseeighteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMENTARIOS_ONE_ACTIVITY"

  }
}
