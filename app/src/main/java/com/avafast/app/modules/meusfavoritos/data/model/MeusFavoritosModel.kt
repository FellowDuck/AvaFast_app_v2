package com.avafast.app.modules.meusfavoritos.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class MeusFavoritosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCocoBambu: String? = MyApp.getInstance().resources.getString(R.string.lbl_nau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrutosdoMar: String? = MyApp.getInstance().resources.getString(R.string.lbl_frutos_do_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt87avaliaes: String? = MyApp.getInstance().resources.getString(R.string.lbl_62_avalia_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeusFavoritos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_meus_favoritos)

)
