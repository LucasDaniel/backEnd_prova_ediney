package com.example.provaLucas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.provaLucas.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	public List<User> findByNomeLikeIgnoreCase(String nome);
	
}
