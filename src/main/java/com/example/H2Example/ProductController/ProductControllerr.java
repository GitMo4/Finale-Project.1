package com.example.H2Example.ProductController;


import com.example.H2Example.Product.Product;
import com.example.H2Example.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerr{

    @Autowired
    ProductService productService;


    @GetMapping("/product")
    private List<Product> getAllProduct(){
        return productService.getAllProduct();
    }


    @GetMapping("/product/{id}")
    private Product getProduct(@PathVariable("id") int id){
        return productService.getProductById(id);
    }


    @DeleteMapping("/product/{id}")
    private void deleteProduct(@PathVariable("id") int id){
        productService.delete(id);
    }


    @PostMapping("/product")
    private int saveProduct(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product.getId();
    }

}