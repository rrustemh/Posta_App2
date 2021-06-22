package com.example.posta_app.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/posta_app/data/AppRepository;", "", "senderId", "", "deliveryDao", "Lcom/example/posta_app/data/DeliveryDao;", "(ILcom/example/posta_app/data/DeliveryDao;)V", "getAllDeliveries", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/posta_app/data/DeliveryItem;", "getGetAllDeliveries", "()Landroidx/lifecycle/LiveData;", "addDelivery", "", "deliveryItem", "(Lcom/example/posta_app/data/DeliveryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.posta_app.data.DeliveryItem>> getAllDeliveries = null;
    private final com.example.posta_app.data.DeliveryDao deliveryDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.posta_app.data.DeliveryItem>> getGetAllDeliveries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addDelivery(@org.jetbrains.annotations.NotNull()
    com.example.posta_app.data.DeliveryItem deliveryItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public AppRepository(int senderId, @org.jetbrains.annotations.NotNull()
    com.example.posta_app.data.DeliveryDao deliveryDao) {
        super();
    }
}