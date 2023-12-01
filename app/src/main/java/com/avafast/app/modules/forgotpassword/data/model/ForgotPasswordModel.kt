package com.avafast.app.modules.forgotpassword.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecuperaraSen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recuperar_a_sen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecuperaraSenOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recuperar_a_sen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelecioneumad: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selecione_uma_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEndereodeEma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_endere_o_de_ema)

)
