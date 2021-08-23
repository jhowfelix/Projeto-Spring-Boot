package com.esturando.PrimeiroProjeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esturando.PrimeiroProjeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
