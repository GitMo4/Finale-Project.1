package com.example.H2Example.ProductRepo;


import com.example.H2Example.Product.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer>{



}