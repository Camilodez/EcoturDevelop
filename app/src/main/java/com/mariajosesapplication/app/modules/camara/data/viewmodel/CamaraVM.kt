package com.mariajosesapplication.app.modules.camara.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.camara.`data`.model.CamaraModel
import org.koin.core.KoinComponent

class CamaraVM : ViewModel(), KoinComponent {
  val camaraModel: MutableLiveData<CamaraModel> = MutableLiveData(CamaraModel())

  var navArguments: Bundle? = null
}
