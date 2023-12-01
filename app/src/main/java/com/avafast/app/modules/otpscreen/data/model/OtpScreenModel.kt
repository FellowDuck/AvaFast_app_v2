package com.avafast.app.modules.otpscreen.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class OtpScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifiqueseun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verifique_seu_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerefiqueseuN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verefique_seu_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInsiraocodigo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_insira_o_codigo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNorecebeuoc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_n_o_recebeu_o_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecebaumnovo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receba_um_novo)

)
