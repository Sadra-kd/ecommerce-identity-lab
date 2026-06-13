package com.khodadadzadeh.ecommerce_identity_lab.product.control;

import com.khodadadzadeh.ecommerce_identity_lab.exception.NotFoundException;
import com.khodadadzadeh.ecommerce_identity_lab.product.entity.Product;
import com.khodadadzadeh.ecommerce_identity_lab.product.entity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetProductService {

    private final ProductRepository productRepository;

    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.product.not-found", id));
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
