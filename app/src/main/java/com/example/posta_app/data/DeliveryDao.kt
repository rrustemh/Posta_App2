package com.example.posta_app.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DeliveryDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun AddDelivery(delivery: DeliveryItem)
    @Query("SELECT * FROM Deliveries WHERE SenderId = :SenderId")
    fun GetAllDeliveries(SenderId: Int) : LiveData<List<DeliveryItem>>
}