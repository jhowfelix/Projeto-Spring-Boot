package com.esturando.PrimeiroProjeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esturando.PrimeiroProjeto.entities.User;
import com.esturando.PrimeiroProjeto.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public User update(Long id, User user) {
		User usuario = repository.getOne(id);
		updateDate(usuario, user);
		return repository.save(usuario);
		
	}
	
	private void updateDate(User usuario, User user) {
		usuario.setName(user.getName());
		usuario.setEmail(user.getEmail());
		usuario.setPhone(user.getPhone());
		
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
