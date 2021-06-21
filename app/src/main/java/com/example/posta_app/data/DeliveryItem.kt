package com.example.posta_app.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Deliveries")
data class DeliveryItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val recieverName: String,
    val address: String,
    val city: String,
    val phoneNumber: String,
    val deliveryStatus: String,
    val senderId: Int)