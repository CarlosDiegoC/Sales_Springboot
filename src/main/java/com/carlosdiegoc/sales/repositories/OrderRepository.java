package com.carlosdiegoc.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.sales.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
