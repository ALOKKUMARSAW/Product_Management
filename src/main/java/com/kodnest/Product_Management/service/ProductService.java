package com.kodnest.Product_Management.service;

import java.util.List;
import java.util.Optional;

import com.kodnest.Product_Management.entity.Product;



public interface ProductService {
	String addProduct(Product prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product> viewAllProducts();
}
