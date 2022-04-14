package com.carlosdiegoc.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.sales.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
