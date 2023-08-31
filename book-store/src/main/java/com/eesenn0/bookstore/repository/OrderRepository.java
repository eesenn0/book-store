package com.eesenn0.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eesenn0.bookstore.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
