package com.nghiasoftware.service_product.services.imp;

import com.nghiasoftware.service_product.dto.ProductDTO;
import com.nghiasoftware.service_product.mapper.ProductMapper;
import com.nghiasoftware.service_product.repository.ProductRepository;
import com.nghiasoftware.service_product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(String id, ProductDTO productDTO) {
        return null;
    }

    @Override
    public void deleteProduct(String id) {

    }

    @Override
    public ProductDTO getProductById(String id) {
        return null;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::mapToDTO).toList();
    }

}
