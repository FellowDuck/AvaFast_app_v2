package com.avafast.app.modules.bemvindo.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class BemVindoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAprendaamexer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aprenda_a_mexer)

)
