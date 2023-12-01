package com.avafast.app.modules.login.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBemVindo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntrenasuaco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_entre_na_sua_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLembrarSempre: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lembrar_sempre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsqueceuasenh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esqueceu_a_senh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordFieldValue: String? = null
)
