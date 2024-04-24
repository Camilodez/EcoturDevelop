package com.mariajosesapplication.app.modules.edicionperfil.ui

import android.content.Intent
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEdicionperfilBinding
import com.mariajosesapplication.app.modules.caracteristicasespecie.ui.CaracteristicasespecieActivity
import com.mariajosesapplication.app.modules.comunidadgeneral.ui.ComunidadGeneralActivity
import com.mariajosesapplication.app.modules.ecodex.ui.EcodexActivity
import com.mariajosesapplication.app.modules.edicionperfil.`data`.viewmodel.EdicionperfilVM
import com.mariajosesapplication.app.modules.ingresodesesion.ui.IngresoDeSesionActivity
import com.mariajosesapplication.app.modules.panelgeneral.ui.PanelGeneralActivity
import kotlin.String
import kotlin.Unit

class EdicionperfilActivity :
    BaseActivity<ActivityEdicionperfilBinding>(R.layout.activity_edicionperfil) {
  private val viewModel: EdicionperfilVM by viewModels<EdicionperfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.edicionperfilVM = viewModel

    binding.imageOpenpaneOne.setOnClickListener(){

      salirseapp();
    }

    binding.imagePersonOne.setOnClickListener(){
      modificarusuario();
    }

    binding.imageOphthalmology.setOnClickListener(){
      comunidadgeneral();
    }

    binding.imageBinocularsOne.setOnClickListener(){
      caracteristicasdelave();
    }

    binding.imageHomeOne.setOnClickListener(){
      home();
    }


  }

  private fun home(){
    val intent = Intent(this, PanelGeneralActivity ::class.java)
    startActivity(intent)
  }


  private fun caracteristicasdelave(){
    val intent = Intent(this, EcodexActivity ::class.java)
    startActivity(intent)
  }

  private fun comunidadgeneral(){
    val intent = Intent(this, ComunidadGeneralActivity ::class.java)
    startActivity(intent)
  }


  private fun modificarusuario(){
    val intent = Intent(this, EdicionperfilActivity ::class.java)
    startActivity(intent)
  }

  private fun salirseapp (){
    val intent = Intent(this, IngresoDeSesionActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDICIONPERFIL_ACTIVITY"

  }
}
