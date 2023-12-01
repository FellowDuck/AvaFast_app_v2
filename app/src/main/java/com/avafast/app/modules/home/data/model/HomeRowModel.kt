package com.avafast.app.modules.home.`data`.model

import com.avafast.app.R
import com.avafast.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVegetariano: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegetariano)

)
