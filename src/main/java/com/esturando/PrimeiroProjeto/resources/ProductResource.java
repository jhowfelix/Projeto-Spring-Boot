package com.esturando.PrimeiroProjeto.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esturando.PrimeiroProjeto.entities.Product;
import com.esturando.PrimeiroProjeto.repositories.ProductRepository;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository repository;

	@GetMapping
	public List<Product> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{Id}")
	public Product findById(@PathVariable Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}

}
