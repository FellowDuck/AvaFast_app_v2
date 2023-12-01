package com.avafast.app.modules.comentariosone.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class ComentariosOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaliaesaute: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avalia_es_aute)

)
