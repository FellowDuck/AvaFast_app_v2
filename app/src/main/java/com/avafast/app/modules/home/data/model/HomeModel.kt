package com.avafast.app.modules.home.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGarantacupons: String? =
      MyApp.getInstance().resources.getString(R.string.msg_garanta_cupons)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComidaMex: String? = MyApp.getInstance().resources.getString(R.string.lbl_comida_mex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantesme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restaurantes_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvaFast: String? = MyApp.getInstance().resources.getString(R.string.lbl_avafast)

)
