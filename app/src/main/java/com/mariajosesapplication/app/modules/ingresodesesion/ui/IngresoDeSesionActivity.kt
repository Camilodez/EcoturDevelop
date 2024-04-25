package com.mariajosesapplication.app.modules.ingresodesesion.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityIngresoDeSesionBinding
import com.mariajosesapplication.app.modules.ingresodesesion.`data`.viewmodel.IngresoDeSesionVM
import com.mariajosesapplication.app.modules.panelgeneral.ui.PanelGeneralActivity
import com.mariajosesapplication.app.modules.registro.ui.RegistroActivity
import kotlin.String
import kotlin.Unit

class IngresoDeSesionActivity :
    BaseActivity<ActivityIngresoDeSesionBinding>(R.layout.activity_ingreso_de_sesion) {
  private val viewModel: IngresoDeSesionVM by viewModels<IngresoDeSesionVM>()

  @SuppressLint("SuspiciousIndentation")
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ingresoDeSesionVM = viewModel


      binding.btnIniciarSesin.setOnClickListener {

        iniciarSesion();

      }

    binding.btnRegistrarse.setOnClickListener(){
      registrarse();
    }




    }

  private fun registrarse(){

    val intent = Intent(this, RegistroActivity::class.java)
    startActivity(intent)
  }




  private fun iniciarSesion(){

      val intent = Intent(this, PanelGeneralActivity::class.java)
      startActivity(intent)
    }



    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "INGRESO_DE_SESION_ACTIVITY"

    }
  }
