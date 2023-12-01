package com.avafast.app.modules.comentarios.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class ComentariosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaliaesprv: String? = MyApp.getInstance().resources.getString(R.string.msg_avalia_es_pr_v)

)
