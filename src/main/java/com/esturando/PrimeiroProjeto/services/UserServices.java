package com.esturando.PrimeiroProjeto.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.esturando.PrimeiroProjeto.entities.User;
import com.esturando.PrimeiroProjeto.repositories.UserRepository;
import com.esturando.PrimeiroProjeto.services.exceptions.DatabaseException;
import com.esturando.PrimeiroProjeto.services.exceptions.ResourceNotFoundException;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user) {
		return repository.save(user);
	}

	public User update(Long id, User user) {
		try {
			User usuario = repository.getOne(id);
			updateDate(usuario, user);
			return repository.save(usuario);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void updateDate(User usuario, User user) {
		usuario.setName(user.getName());
		usuario.setEmail(user.getEmail());
		usuario.setPhone(user.getPhone());

	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

}
