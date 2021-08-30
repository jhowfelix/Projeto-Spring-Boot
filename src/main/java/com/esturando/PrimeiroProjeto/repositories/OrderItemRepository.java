package com.esturando.PrimeiroProjeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esturando.PrimeiroProjeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
