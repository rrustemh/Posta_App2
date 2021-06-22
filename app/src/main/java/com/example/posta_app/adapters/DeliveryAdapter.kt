package com.example.posta_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.posta_app.data.DeliveryItem
import com.example.posta_app.databinding.DeliveryItemBinding

class DeliveryAdapter(private val listener: OnItemClickListener) : RecyclerView.Adapter<DeliveryAdapter.DeliveryViewHolder>() {
    private var deliveryItemList = emptyList<DeliveryItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveryViewHolder {
        val itemBinding = DeliveryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DeliveryViewHolder(itemBinding)
    }

    // 1

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
    inner class DeliveryViewHolder(itemBinding: DeliveryItemBinding) : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {
        val deliveryId: TextView = itemBinding.idTextView
        val recieverName: TextView = itemBinding.recieverNameTextView
        var address: TextView = itemBinding.addressTextView
        val phoneNumber: TextView = itemBinding.phoneNumberTextView
        init {
            itemBinding.root.setOnClickListener (this)
        }
        override fun onClick(v: View?) {
            val position = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.OnItemClick(position)
            }
        }
    }
    fun setDeliveries(deliveries: List<DeliveryItem>) {
        this.deliveryItemList = deliveries
        notifyDataSetChanged()
    }
    interface OnItemClickListener {
        fun OnItemClick(position: Int)
    }

}