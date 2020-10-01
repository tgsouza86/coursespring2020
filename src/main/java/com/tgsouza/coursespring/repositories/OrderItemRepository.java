package com.tgsouza.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgsouza.coursespring.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
