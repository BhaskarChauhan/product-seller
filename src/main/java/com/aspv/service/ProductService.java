package com.aspv.service;

import java.util.List;

import com.aspv.model.Product;

public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
