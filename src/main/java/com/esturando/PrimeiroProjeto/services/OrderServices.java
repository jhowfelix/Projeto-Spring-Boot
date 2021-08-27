package com.esturando.PrimeiroProjeto.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esturando.PrimeiroProjeto.entities.Order;
import com.esturando.PrimeiroProjeto.repositories.OrderRepository;



@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj = repository.findById(Id);
		return obj.get();
	}
	
}
