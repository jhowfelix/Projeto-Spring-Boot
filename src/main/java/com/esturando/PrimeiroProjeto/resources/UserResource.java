package com.esturando.PrimeiroProjeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esturando.PrimeiroProjeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "bob", "bob@gmail.com", "97222-9547", "1234");
		return ResponseEntity.ok().body(u);

	}

}
