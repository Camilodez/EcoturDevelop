package com.mariajosesapplication.app.modules.ingresodesesion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.ingresodesesion.`data`.model.IngresoDeSesionModel
import org.koin.core.KoinComponent

class IngresoDeSesionVM : ViewModel(), KoinComponent {
  val ingresoDeSesionModel: MutableLiveData<IngresoDeSesionModel> =
      MutableLiveData(IngresoDeSesionModel())

  var navArguments: Bundle? = null
}
