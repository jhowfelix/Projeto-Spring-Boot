package com.esturando.PrimeiroProjeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esturando.PrimeiroProjeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
