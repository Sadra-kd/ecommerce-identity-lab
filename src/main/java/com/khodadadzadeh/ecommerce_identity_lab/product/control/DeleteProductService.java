package com.khodadadzadeh.ecommerce_identity_lab.product.control;

import com.khodadadzadeh.ecommerce_identity_lab.exception.NotFoundException;
import com.khodadadzadeh.ecommerce_identity_lab.product.entity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DeleteProductService {

    private final ProductRepository productRepository;

    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new NotFoundException("error.product.not-found", id);
        }
        productRepository.deleteById(id);
    }
}
