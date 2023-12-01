package com.avafast.app.modules.comoresgatarpontos.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class ComoResgatarPontosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComoresgataro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_como_resgatar_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
