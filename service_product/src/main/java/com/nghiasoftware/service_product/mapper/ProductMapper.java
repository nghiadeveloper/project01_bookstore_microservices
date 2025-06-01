package com.nghiasoftware.service_product.mapper;

import com.nghiasoftware.service_product.dto.ProductDTO;
import com.nghiasoftware.service_product.entity.Product;

public class ProductMapper {

    // Library: mapstruct to DTO
    public static ProductDTO mapToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setTitle(product.getTitle());
        dto.setAuthor(product.getAuthor());
        dto.setReview(product.getReview());
        dto.setPrice(product.getPrice());
        dto.setImages(product.getImages());
        dto.setCreatedDate(product.getCreatedDate());
        dto.setUpdatedDate(product.getUpdatedDate());
        return dto;
    }

}
