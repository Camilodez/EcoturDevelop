package com.mariajosesapplication.app.modules.registro.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityRegistroBinding
import com.mariajosesapplication.app.modules.panelgeneral.ui.PanelGeneralActivity
import com.mariajosesapplication.app.modules.registro.`data`.viewmodel.RegistroVM
import kotlin.String
import kotlin.Unit

class RegistroActivity : BaseActivity<ActivityRegistroBinding>(R.layout.activity_registro) {
  private val viewModel: RegistroVM by viewModels<RegistroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registroVM = viewModel


    binding.btnRegistrarse.setOnClickListener(){
      panelcentral();
    }

  }

  private fun panelcentral(){
    val intent = Intent(this, PanelGeneralActivity::class.java)
    startActivity(intent)
  }

  override fun setUpClicks() {
    TODO("Not yet implemented")
  }

  companion object {
    const val TAG: String = "REGISTRO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistroActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}






