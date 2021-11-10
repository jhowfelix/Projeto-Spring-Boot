package com.esturando.PrimeiroProjeto.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esturando.PrimeiroProjeto.entities.Category;
import com.esturando.PrimeiroProjeto.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

	@Autowired
	private CategoryRepository repository;

	@GetMapping
	public List<Category> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{Id}")
	public Category findById(@PathVariable Long Id) {
		Optional<Category> obj = repository.findById(Id);
		return obj.get();
	}

}
