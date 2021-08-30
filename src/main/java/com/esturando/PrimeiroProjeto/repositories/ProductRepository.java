package com.esturando.PrimeiroProjeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esturando.PrimeiroProjeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
