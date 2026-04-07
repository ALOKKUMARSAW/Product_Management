package com.kodnest.Product_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.Product_Management.entity.Product;


public interface ProductRepository 

			extends JpaRepository<Product, Long>{

}
