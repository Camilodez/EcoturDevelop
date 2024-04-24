package com.mariajosesapplication.app.modules.caracteristicasespecie.ui

import androidx.activity.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityCaracteristicasespecieBinding
import com.mariajosesapplication.app.modules.caracteristicasespecie.`data`.viewmodel.CaracteristicasespecieVM
import kotlin.String
import kotlin.Unit

class CaracteristicasespecieActivity :
    BaseActivity<ActivityCaracteristicasespecieBinding>(R.layout.activity_caracteristicasespecie),
    OnMapReadyCallback {
  private val viewModel: CaracteristicasespecieVM by viewModels<CaracteristicasespecieVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.caracteristicasespecieVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapMap) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARACTERISTICASESPECIE_ACTIVITY"

  }
}
