package com.example.posta_app.fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class DeliveryDetailsFragmentArgs(
  val Id: String,
  val recieverName: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("Id", this.Id)
    result.putString("recieverName", this.recieverName)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DeliveryDetailsFragmentArgs {
      bundle.setClassLoader(DeliveryDetailsFragmentArgs::class.java.classLoader)
      val __Id : String?
      if (bundle.containsKey("Id")) {
        __Id = bundle.getString("Id")
        if (__Id == null) {
          throw IllegalArgumentException("Argument \"Id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Id\" is missing and does not have an android:defaultValue")
      }
      val __recieverName : String?
      if (bundle.containsKey("recieverName")) {
        __recieverName = bundle.getString("recieverName")
        if (__recieverName == null) {
          throw IllegalArgumentException("Argument \"recieverName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"recieverName\" is missing and does not have an android:defaultValue")
      }
      return DeliveryDetailsFragmentArgs(__Id, __recieverName)
    }
  }
}
