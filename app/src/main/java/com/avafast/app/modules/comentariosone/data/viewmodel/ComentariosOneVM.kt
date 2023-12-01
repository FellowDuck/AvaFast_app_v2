package com.avafast.app.modules.comentariosone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.comentariosone.`data`.model.ComentariosOneModel
import com.avafast.app.modules.comentariosone.`data`.model.ListellipseeighteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ComentariosOneVM : ViewModel(), KoinComponent {
  val comentariosOneModel: MutableLiveData<ComentariosOneModel> =
      MutableLiveData(ComentariosOneModel())

  var navArguments: Bundle? = null

  val listellipseeighteenList: MutableLiveData<MutableList<ListellipseeighteenRowModel>> =
      MutableLiveData(mutableListOf())
}
