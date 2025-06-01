package com.nghiasoftware.service_product.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductDTO {
    private String id;
    private String title;
    private String author;
    private int review;
    private double price;
    private String images;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
