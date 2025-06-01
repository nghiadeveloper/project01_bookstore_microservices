package com.nghiasoftware.service_product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * BTVN: Làm cách nào đó tái sử dụng entity cho các product khác nhau
 * Onion design pattern
 */
@Data
@Entity(name = "product")
public class Product {

    @Id
    private String id;

    private String title;
    private String author;
    private int review;
    private double price;
    private String images;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
