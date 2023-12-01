package com.avafast.app.modules.comentarios.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.comentarios.`data`.model.ComentariosModel
import com.avafast.app.modules.comentarios.`data`.model.ComentariosRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ComentariosVM : ViewModel(), KoinComponent {
  val comentariosModel: MutableLiveData<ComentariosModel> = MutableLiveData(ComentariosModel())

  var navArguments: Bundle? = null

  val comentariosList: MutableLiveData<MutableList<ComentariosRowModel>> =
      MutableLiveData(mutableListOf())
}
