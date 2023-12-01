package com.avafast.app.modules.avalieeganhepontos.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class AvalieEGanhePontosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_avalie_e_ganhe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
