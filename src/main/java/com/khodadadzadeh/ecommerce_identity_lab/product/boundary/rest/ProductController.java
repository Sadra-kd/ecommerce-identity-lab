package com.khodadadzadeh.ecommerce_identity_lab.product.boundary.rest;

import com.khodadadzadeh.ecommerce_identity_lab.product.control.ProductFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductFacade productFacade;
    private final ProductMapper productMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody @Valid CreateProductRequest request) {
        return productMapper.toResponse(
                productFacade.createProduct(productMapper.toEntity(request))
        );
    }

    @GetMapping("/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        return productMapper.toResponse(productFacade.getProductById(id));
    }

    @GetMapping
    public List<ProductResponse> getProducts() {
        return productFacade.getAllProducts()
                .stream()
                .map(productMapper::toResponse)
                .toList();
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(@PathVariable Long id,
                                         @RequestBody @Valid EditProductRequest request) {
        return productMapper.toResponse(
                productFacade.updateProduct(id, product -> productMapper.update(request, product))
        );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
        productFacade.deleteProduct(id);
    }
}
