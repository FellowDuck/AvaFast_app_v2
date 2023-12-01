package com.avafast.app.modules.cadastroback.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class CadastroBackModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBemVindo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCadastroRpido: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cadastro_r_pido)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordFieldValue: String? = null
)
