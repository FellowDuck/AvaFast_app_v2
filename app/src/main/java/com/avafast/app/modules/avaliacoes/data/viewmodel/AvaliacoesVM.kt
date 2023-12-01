package com.avafast.app.modules.avaliacoes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avafast.app.modules.avaliacoes.`data`.model.AvaliacoesModel
import com.avafast.app.modules.avaliacoes.`data`.model.AvaliacoesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AvaliacoesVM : ViewModel(), KoinComponent {
  val avaliacoesModel: MutableLiveData<AvaliacoesModel> = MutableLiveData(AvaliacoesModel())

  var navArguments: Bundle? = null

  val avaliacoesList: MutableLiveData<MutableList<AvaliacoesRowModel>> =
      MutableLiveData(mutableListOf())
}
