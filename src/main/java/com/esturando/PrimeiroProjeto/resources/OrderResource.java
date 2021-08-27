package com.esturando.PrimeiroProjeto.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esturando.PrimeiroProjeto.entities.Order;
import com.esturando.PrimeiroProjeto.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/Order")
public class OrderResource {
	
	
	@Autowired
	private OrderRepository repository;
	
	
	@GetMapping
	public List<Order> findAll(){
		return repository.findAll();
	}
	@GetMapping(value = "/{Id}")
	public Order findById(@PathVariable Long Id) {
		Optional<Order> obj = repository.findById(Id);
		return obj.get();
	}

}
