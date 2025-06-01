package com.nghiasoftware.service_product.controller;

import com.nghiasoftware.service_product.dto.ProductDTO;
import com.nghiasoftware.service_product.payload.response.BaseResponse;
import com.nghiasoftware.service_product.services.ProductService;
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
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        BaseResponse response = new BaseResponse();
        response.setCode(HttpStatus.OK.value());
        response.setMessage("Success");
        response.setData(productService.getAllProducts());

        return ResponseEntity.ok(response);
    }

}
