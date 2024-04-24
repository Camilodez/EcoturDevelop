package com.mariajosesapplication.app.modules.comunidadgeneral.ui

import android.content.Intent
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityComunidadGeneralBinding
import com.mariajosesapplication.app.modules.caracteristicasespecie.ui.CaracteristicasespecieActivity
import com.mariajosesapplication.app.modules.comunidadgeneral.`data`.viewmodel.ComunidadGeneralVM
import com.mariajosesapplication.app.modules.ecodex.ui.EcodexActivity
import com.mariajosesapplication.app.modules.edicionperfil.ui.EdicionperfilActivity
import com.mariajosesapplication.app.modules.fotografiascomunidad.ui.FotografiascomunidadActivity
import com.mariajosesapplication.app.modules.ingresodesesion.ui.IngresoDeSesionActivity
import com.mariajosesapplication.app.modules.panelgeneral.ui.PanelGeneralActivity
import kotlin.String
import kotlin.Unit

class ComunidadGeneralActivity :
    BaseActivity<ActivityComunidadGeneralBinding>(R.layout.activity_comunidad_general) {
  private val viewModel: ComunidadGeneralVM by viewModels<ComunidadGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comunidadGeneralVM = viewModel


    binding.imageOpenpaneOne.setOnClickListener(){

      salirseapp();
    }

    binding.imagePersonOne.setOnClickListener(){
      modificarUsuario();
    }

    binding.imageOphthalmology.setOnClickListener(){
      comunidadgeneral();
    }

    binding.imageBinocularsOne.setOnClickListener(){
      caracteristicasdelave();
    }

  }

  private fun caracteristicasdelave(){
    val intent = Intent(this, EcodexActivity ::class.java)
    startActivity(intent)
  }

  private fun comunidadgeneral(){
    val intent = Intent(this, ComunidadGeneralActivity ::class.java)
    startActivity(intent)
  }


  private fun modificarUsuario(){
    val intent = Intent(this, FotografiascomunidadActivity ::class.java)
    startActivity(intent)
  }

  private fun salirseapp (){
    val intent = Intent(this, IngresoDeSesionActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMUNIDAD_GENERAL_ACTIVITY"

  }
}
