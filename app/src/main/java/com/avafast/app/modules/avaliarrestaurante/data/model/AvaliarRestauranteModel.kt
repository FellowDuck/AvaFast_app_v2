package com.avafast.app.modules.avaliarrestaurante.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class AvaliarRestauranteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOqueVocAcho: String? = MyApp.getInstance().resources.getString(R.string.msg_o_que_voc_acho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvalieoRestau: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avalie_o_restau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTellusabouty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_about_y)

)
