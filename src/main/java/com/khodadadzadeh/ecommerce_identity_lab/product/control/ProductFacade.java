package com.khodadadzadeh.ecommerce_identity_lab.product.control;

import com.khodadadzadeh.ecommerce_identity_lab.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
public class ProductFacade {

    private final CreateProductService createProductService;
    private final DeleteProductService deleteProductService;
    private final EditProductService editProductService;
    private final GetProductService getProductService;

    public Product createProduct(Product product) {
        return createProductService.create(product);
    }

    public Product updateProduct(Long id, Consumer<Product> updater) {
        return editProductService.edit(id, updater);
    }

    public void deleteProduct(Long id) {
        deleteProductService.delete(id);
    }

    public Product getProductById(Long id) {
        return getProductService.findById(id);
    }

    public List<Product> getAllProducts() {
        return getProductService.findAll();
    }
}
