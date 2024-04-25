package com.mariajosesapplication.app.modules.edicionfotografia.ui

import android.content.Intent
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEdicionfotografiaBinding
import com.mariajosesapplication.app.modules.camara.ui.CamaraActivity
import com.mariajosesapplication.app.modules.edicionfotografia.`data`.viewmodel.EdicionfotografiaVM
import com.mariajosesapplication.app.modules.fotografiascomunidad.ui.FotografiascomunidadActivity
import kotlin.String
import kotlin.Unit

class EdicionfotografiaActivity :
    BaseActivity<ActivityEdicionfotografiaBinding>(R.layout.activity_edicionfotografia) {
  private val viewModel: EdicionfotografiaVM by viewModels<EdicionfotografiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.edicionfotografiaVM = viewModel

    binding.imageBackOne.setOnClickListener(){
      volvercamara();

    }

    binding.btnPublicar.setOnClickListener(){
      publicar();

    }
  }


  private fun volvercamara(){
    val intent = Intent(this, CamaraActivity ::class.java)
    startActivity(intent)
  }

  private fun publicar(){
    val intent = Intent(this, FotografiascomunidadActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDICIONFOTOGRAFIA_ACTIVITY"

  }
}
