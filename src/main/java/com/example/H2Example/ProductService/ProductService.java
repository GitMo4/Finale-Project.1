package com.example.H2Example.ProductService;

import com.example.H2Example.Product.Product;
import com.example.H2Example.ProductRepo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }



    public Product getProductByID(int id){
        return productRepository.findById(id).get();
    }

    public void saveOrUpdate(Product product){
        productRepository.save(product);
    }

    public void delete(int id){
        productRepository.deleteById(id);
    }

    public Product getProductById(int id) {

        return null;
    }
}