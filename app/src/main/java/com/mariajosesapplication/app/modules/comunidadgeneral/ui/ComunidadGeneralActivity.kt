package com.mariajosesapplication.app.modules.comunidadgeneral.ui

import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityComunidadGeneralBinding
import com.mariajosesapplication.app.modules.comunidadgeneral.`data`.viewmodel.ComunidadGeneralVM
import kotlin.String
import kotlin.Unit

class ComunidadGeneralActivity :
    BaseActivity<ActivityComunidadGeneralBinding>(R.layout.activity_comunidad_general) {
  private val viewModel: ComunidadGeneralVM by viewModels<ComunidadGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comunidadGeneralVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMUNIDAD_GENERAL_ACTIVITY"

  }
}
