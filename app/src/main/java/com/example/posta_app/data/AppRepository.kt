package com.example.posta_app.data

import androidx.lifecycle.LiveData

class AppRepository(senderId: Int, private val deliveryDao: DeliveryDao) {
    val getAllDeliveries:LiveData<List<DeliveryItem>> = deliveryDao.GetAllDeliveries(senderId)

    suspend fun addDelivery(deliveryItem: DeliveryItem){
        deliveryDao.AddDelivery(deliveryItem)
    }
}