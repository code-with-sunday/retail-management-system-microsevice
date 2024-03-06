package com.ochefitech.orderservice.service;

import com.ochefitech.orderservice.dto.OrderRequest;

public interface OrderService {

    String placeOrder(OrderRequest orderRequest);
}
