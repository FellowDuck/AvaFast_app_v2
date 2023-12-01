package com.avafast.app.modules.avaliacoes.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class AvaliacoesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNomeRestaurant: String? = MyApp.getInstance().resources.getString(R.string.lbl_coco_bambu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFocodorest: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)

)
