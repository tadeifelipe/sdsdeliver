package com.tadeifelipe.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tadeifelipe.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
}
