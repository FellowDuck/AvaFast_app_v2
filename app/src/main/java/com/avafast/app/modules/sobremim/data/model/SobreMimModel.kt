package com.avafast.app.modules.sobremim.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class SobreMimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSobremim: String? = MyApp.getInstance().resources.getString(R.string.lbl_sobre_mim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetalhesPessoa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_detalhes_pessoa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrocaraSenha: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trocar_a_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenhaatual: String? = MyApp.getInstance().resources.getString(R.string.lbl_senha_atual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmarSenha: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_confirmar_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup125Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
