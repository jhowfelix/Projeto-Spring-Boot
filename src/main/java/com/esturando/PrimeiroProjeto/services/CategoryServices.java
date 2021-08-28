package com.esturando.PrimeiroProjeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esturando.PrimeiroProjeto.entities.Category;
import com.esturando.PrimeiroProjeto.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long Id) {
		Optional<Category> obj = repository.findById(Id);
		return obj.get();
	}

}
