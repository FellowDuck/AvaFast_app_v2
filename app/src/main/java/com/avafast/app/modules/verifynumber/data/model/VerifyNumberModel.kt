package com.avafast.app.modules.verifynumber.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class VerifyNumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifiqueseun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verifique_seu_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQualseuNumero: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qual_seu_numero)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEscrevaabaixo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_escreva_abaixo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_55)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt40028922: String? = MyApp.getInstance().resources.getString(R.string.lbl_40028922)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReenviarCodig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reenviar_co_dig)

)
