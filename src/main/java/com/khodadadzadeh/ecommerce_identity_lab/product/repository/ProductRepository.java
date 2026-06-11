package com.khodadadzadeh.ecommerce_identity_lab.product.repository;

import com.khodadadzadeh.ecommerce_identity_lab.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
