package com.mariajosesapplication.app.modules.ecodex.ui

import android.content.Intent
import android.view.View
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEcodexBinding
import com.mariajosesapplication.app.modules.comunidadgeneral.ui.ComunidadGeneralActivity
import com.mariajosesapplication.app.modules.ecodex.`data`.model.UserprofileRowModel
import com.mariajosesapplication.app.modules.ecodex.`data`.viewmodel.EcodexVM
import com.mariajosesapplication.app.modules.edicionperfil.ui.EdicionperfilActivity
import com.mariajosesapplication.app.modules.fotografiascomunidad.ui.FotografiascomunidadActivity
import com.mariajosesapplication.app.modules.ingresodesesion.ui.IngresoDeSesionActivity
import com.mariajosesapplication.app.modules.panelgeneral.ui.PanelGeneralActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EcodexActivity : BaseActivity<ActivityEcodexBinding>(R.layout.activity_ecodex) {
  private val viewModel: EcodexVM by viewModels<EcodexVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userprofileAdapter =
    UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
    binding.recyclerUserprofile.adapter = userprofileAdapter
    userprofileAdapter.setOnItemClickListener(
    object : UserprofileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserprofileRowModel) {
        onClickRecyclerUserprofile(view, position, item)
      }
    }
    )
    viewModel.userprofileList.observe(this) {
      userprofileAdapter.updateData(it)
    }
    binding.ecodexVM = viewModel

    binding.imageOpenpaneOne.setOnClickListener(){

      salirseapp();
    }

    binding.imagePersonOne.setOnClickListener(){
      modificarusuario();
    }

    binding.imageBinocularsOne.setOnClickListener(){
      comunidadgeneral();
    }

    binding.imageOphthalmology.setOnClickListener(){
      FotografiasComunidad();
    }


    binding.imageHomeOne.setOnClickListener(){
      home();
    }
  }

  private fun home(){
    val intent = Intent(this, PanelGeneralActivity ::class.java)
    startActivity(intent)
  }


  private fun FotografiasComunidad(){
    val intent = Intent(this, ComunidadGeneralActivity ::class.java)
    startActivity(intent)
  }

  private fun comunidadgeneral(){
    val intent = Intent(this, EcodexActivity ::class.java)
    startActivity(intent)
  }


  private fun modificarusuario(){
    val intent = Intent(this, FotografiascomunidadActivity ::class.java)
    startActivity(intent)
  }

  private fun salirseapp (){
    val intent = Intent(this, IngresoDeSesionActivity ::class.java)
    startActivity(intent)
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUserprofile(
    view: View,
    position: Int,
    item: UserprofileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ECODEX_ACTIVITY"

  }
}
