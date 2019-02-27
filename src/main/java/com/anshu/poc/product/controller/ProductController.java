package com.anshu.poc.product.controller;

import com.anshu.poc.product.model.ProductConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductConfiguration productConfiguration;

    public ProductConfiguration getProductConfiguration() {
        return productConfiguration;
    }

    public void setProductConfiguration(ProductConfiguration productConfiguration) {
        this.productConfiguration = productConfiguration;
    }

    @GetMapping("config")
    public ResponseEntity<String> getProductConfig() {
        return new ResponseEntity<>(productConfiguration.getLocation(), HttpStatus.OK);
    }
}
