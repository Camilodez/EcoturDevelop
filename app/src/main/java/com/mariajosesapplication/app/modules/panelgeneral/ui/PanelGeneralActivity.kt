package com.mariajosesapplication.app.modules.panelgeneral.ui

import android.content.Intent
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityPanelGeneralBinding
import com.mariajosesapplication.app.modules.camara.ui.CamaraActivity
import com.mariajosesapplication.app.modules.caracteristicasespecie.ui.CaracteristicasespecieActivity
import com.mariajosesapplication.app.modules.comunidadgeneral.ui.ComunidadGeneralActivity
import com.mariajosesapplication.app.modules.ecodex.ui.EcodexActivity
import com.mariajosesapplication.app.modules.edicionperfil.ui.EdicionperfilActivity
import com.mariajosesapplication.app.modules.fotografiascomunidad.ui.FotografiascomunidadActivity
import com.mariajosesapplication.app.modules.ingresodesesion.ui.IngresoDeSesionActivity
import com.mariajosesapplication.app.modules.panelgeneral.`data`.viewmodel.PanelGeneralVM
import kotlin.String
import kotlin.Unit

class PanelGeneralActivity :
    BaseActivity<ActivityPanelGeneralBinding>(R.layout.activity_panel_general) {
  private val viewModel: PanelGeneralVM by viewModels<PanelGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.panelGeneralVM = viewModel

    binding.imageOpenpaneOne.setOnClickListener(){

      salirseapp();
    }

    binding.imageHomeOne.setOnClickListener(){
      menu();
    }

    binding.imageOphthalmology.setOnClickListener(){
      comunidadgeneral();
    }

    binding.imageBinoculars.setOnClickListener(){
      caracteristicasdelave();
    }
    binding.imagePersonOne.setOnClickListener(){
      modificarUsuario();
    }

    binding.imageBinocularsOne.setOnClickListener(){
      TomarFoto();

    }

  }

  private fun TomarFoto(){
    val intent = Intent(this, CamaraActivity ::class.java)
    startActivity(intent)
  }


  private fun modificarUsuario(){
    val intent = Intent(this, FotografiascomunidadActivity ::class.java)
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


  private fun menu(){
    val intent = Intent(this, PanelGeneralActivity ::class.java)
    startActivity(intent)
  }

  private fun salirseapp (){
    val intent = Intent(this, IngresoDeSesionActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PANEL_GENERAL_ACTIVITY"

  }
}
