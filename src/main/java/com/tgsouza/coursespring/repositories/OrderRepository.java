package com.tgsouza.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgsouza.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
