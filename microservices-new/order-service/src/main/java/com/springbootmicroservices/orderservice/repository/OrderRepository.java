package com.springbootmicroservices.orderservice.repository;

import com.springbootmicroservices.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
