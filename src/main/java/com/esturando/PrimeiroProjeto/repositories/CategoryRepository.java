package com.esturando.PrimeiroProjeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esturando.PrimeiroProjeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
