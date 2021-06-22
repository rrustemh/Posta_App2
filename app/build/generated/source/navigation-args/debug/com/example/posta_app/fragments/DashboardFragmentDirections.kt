package com.example.posta_app.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.posta_app.R
import kotlin.Int
import kotlin.String

class DashboardFragmentDirections private constructor() {
  private data class ActionDashboardFragmentToDeliveryDetailsFragment(
    val Id: String,
    val recieverName: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_dashboardFragment_to_deliveryDetailsFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("Id", this.Id)
      result.putString("recieverName", this.recieverName)
      return result
    }
  }

  companion object {
    fun actionDashboardFragmentToDeliveryDetailsFragment(Id: String, recieverName: String):
        NavDirections = ActionDashboardFragmentToDeliveryDetailsFragment(Id, recieverName)
  }
}
