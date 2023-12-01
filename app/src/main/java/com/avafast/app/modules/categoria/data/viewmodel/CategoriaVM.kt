package com.avafast.app.modules.categoria.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.categoria.`data`.model.CategoriaModel
import org.koin.core.KoinComponent

class CategoriaVM : ViewModel(), KoinComponent {
  val categoriaModel: MutableLiveData<CategoriaModel> = MutableLiveData(CategoriaModel())

  var navArguments: Bundle? = null
}
