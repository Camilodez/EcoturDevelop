package com.mariajosesapplication.app.modules.comunidadgeneral.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.comunidadgeneral.`data`.model.ComunidadGeneralModel
import org.koin.core.KoinComponent

class ComunidadGeneralVM : ViewModel(), KoinComponent {
  val comunidadGeneralModel: MutableLiveData<ComunidadGeneralModel> =
      MutableLiveData(ComunidadGeneralModel())

  var navArguments: Bundle? = null
}
