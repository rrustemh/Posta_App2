package com.example.posta_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.posta_app.DeliveryItem
import com.example.posta_app.R
import com.example.posta_app.databinding.DeliveryItemBinding

class DeliveryAdapter(private val deliveryItemList: List<DeliveryItem>) : RecyclerView.Adapter<DeliveryAdapter.DeliveryViewHolder>() {
    class DeliveryViewHolder(itemBinding: DeliveryItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        val deliveryId: TextView = itemBinding.idTextView
        val recieverName: TextView = itemBinding.recieverNameTextView
        var address: TextView = itemBinding.addressTextView
        val phoneNumber: TextView = itemBinding.phoneNumberTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveryViewHolder {
        //val itemView = LayoutInflater.from(parent.context).inflate(R.layout.delivery_item, parent, false)
        val itemBinding = DeliveryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DeliveryViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: DeliveryViewHolder, position: Int) {
        val currentItem = deliveryItemList[position]
        holder.deliveryId.text = currentItem.id.toString()
        holder.recieverName.text =currentItem.recieverName
        holder.address.text = currentItem.address
        holder.phoneNumber.text = currentItem.phoneNumber
    }

    override fun getItemCount(): Int {
        return deliveryItemList.size
    }
}