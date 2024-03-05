package com.ochefitech.productservice.service;

import com.ochefitech.productservice.dto.ProductRequest;
import com.ochefitech.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
