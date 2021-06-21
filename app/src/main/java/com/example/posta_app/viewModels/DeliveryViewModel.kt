package com.example.posta_app.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.posta_app.data.AppDatabase
import com.example.posta_app.data.AppRepository
import com.example.posta_app.data.DeliveryItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DeliveryViewModel(application: Application) : AndroidViewModel(application) {
    val allDeliveries: LiveData<List<DeliveryItem>>
    private val repository: AppRepository
    init {
        val deliveryDao = AppDatabase.getDatabase(application).deliveryDao()
        repository = AppRepository(10, deliveryDao)
        allDeliveries = repository.getAllDeliveries
    }
    fun addDelivery(deliveryItem: DeliveryItem){
        viewModelScope.launch(Dispatchers.IO){
            repository.addDelivery(deliveryItem)
        }
    }

}