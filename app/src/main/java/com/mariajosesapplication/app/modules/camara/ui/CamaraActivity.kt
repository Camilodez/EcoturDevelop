package com.mariajosesapplication.app.modules.camara.ui

import android.content.Intent
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityCamaraBinding
import com.mariajosesapplication.app.modules.camara.`data`.viewmodel.CamaraVM
import com.mariajosesapplication.app.modules.edicionfotografia.ui.EdicionfotografiaActivity
import kotlin.String
import kotlin.Unit

class CamaraActivity : BaseActivity<ActivityCamaraBinding>(R.layout.activity_camara) {
  private val viewModel: CamaraVM by viewModels<CamaraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.camaraVM = viewModel

    binding.imageImagesevenOne.setOnClickListener(){
      volverpaginageneral();

    }

    binding.imageSquareborder.setOnClickListener(){
      capturarave();
    }
  }


  private fun volverpaginageneral(){
    val intent = Intent(this, CamaraActivity ::class.java)
    startActivity(intent)
  }

  private fun capturarave(){
    val intent = Intent(this, EdicionfotografiaActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CAMARA_ACTIVITY"

  }
}
