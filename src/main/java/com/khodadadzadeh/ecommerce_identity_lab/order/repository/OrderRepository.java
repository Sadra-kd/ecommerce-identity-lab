package com.khodadadzadeh.ecommerce_identity_lab.order.repository;

import com.khodadadzadeh.ecommerce_identity_lab.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
