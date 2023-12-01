package com.avafast.app.modules.meusfavoritos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.meusfavoritos.`data`.model.MeusFavoritosModel
import org.koin.core.KoinComponent

class MeusFavoritosVM : ViewModel(), KoinComponent {
  val meusFavoritosModel: MutableLiveData<MeusFavoritosModel> =
      MutableLiveData(MeusFavoritosModel())

  var navArguments: Bundle? = null
}
