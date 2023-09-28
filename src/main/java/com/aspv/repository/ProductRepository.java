package com.aspv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspv.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
