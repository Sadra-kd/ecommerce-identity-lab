package com.khodadadzadeh.ecommerce_identity_lab.product.boundary.rest;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String name,
        Long quantity,
        BigDecimal price,
        String description
) {
}
