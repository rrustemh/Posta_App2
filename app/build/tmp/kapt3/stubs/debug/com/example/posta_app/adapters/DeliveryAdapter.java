package com.example.posta_app.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/posta_app/adapters/DeliveryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/posta_app/adapters/DeliveryAdapter$DeliveryViewHolder;", "listener", "Lcom/example/posta_app/adapters/DeliveryAdapter$OnItemClickListener;", "(Lcom/example/posta_app/adapters/DeliveryAdapter$OnItemClickListener;)V", "deliveryItemList", "", "Lcom/example/posta_app/data/DeliveryItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDeliveries", "deliveries", "DeliveryViewHolder", "OnItemClickListener", "app_debug"})
public final class DeliveryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.posta_app.adapters.DeliveryAdapter.DeliveryViewHolder> {
    private java.util.List<com.example.posta_app.data.DeliveryItem> deliveryItemList;
    private final com.example.posta_app.adapters.DeliveryAdapter.OnItemClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.posta_app.adapters.DeliveryAdapter.DeliveryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.posta_app.adapters.DeliveryAdapter.DeliveryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDeliveries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.posta_app.data.DeliveryItem> deliveries) {
    }
    
    public DeliveryAdapter(@org.jetbrains.annotations.NotNull()
    com.example.posta_app.adapters.DeliveryAdapter.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/posta_app/adapters/DeliveryAdapter$DeliveryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemBinding", "Lcom/example/posta_app/databinding/DeliveryItemBinding;", "(Lcom/example/posta_app/adapters/DeliveryAdapter;Lcom/example/posta_app/databinding/DeliveryItemBinding;)V", "address", "Landroid/widget/TextView;", "getAddress", "()Landroid/widget/TextView;", "setAddress", "(Landroid/widget/TextView;)V", "deliveryId", "getDeliveryId", "phoneNumber", "getPhoneNumber", "recieverName", "getRecieverName", "onClick", "", "v", "Landroid/view/View;", "app_debug"})
    public final class DeliveryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView deliveryId = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView recieverName = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView address;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView phoneNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDeliveryId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRecieverName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPhoneNumber() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public DeliveryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.posta_app.databinding.DeliveryItemBinding itemBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/posta_app/adapters/DeliveryAdapter$OnItemClickListener;", "", "OnItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void OnItemClick(int position);
    }
}