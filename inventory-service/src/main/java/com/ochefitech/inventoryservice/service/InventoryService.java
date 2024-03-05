package com.ochefitech.inventoryservice.service;

import com.ochefitech.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

   List<InventoryResponse> isInStock(List<String> skuCode);
}
