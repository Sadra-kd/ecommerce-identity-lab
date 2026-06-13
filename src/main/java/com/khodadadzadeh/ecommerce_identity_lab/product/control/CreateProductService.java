package com.khodadadzadeh.ecommerce_identity_lab.product.control;

import com.khodadadzadeh.ecommerce_identity_lab.product.entity.Product;
import com.khodadadzadeh.ecommerce_identity_lab.product.entity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CreateProductService {

    private final ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }
}
