package com.avafast.app.modules.avaliacoes.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class AvaliacoesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantes: String? = MyApp.getInstance().resources.getString(R.string.msg_minhas_avalia)

)
