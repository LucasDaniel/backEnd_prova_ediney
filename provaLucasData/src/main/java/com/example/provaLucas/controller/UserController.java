package com.example.provaLucas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaLucas.entity.User;
import com.example.provaLucas.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;	
	
	@RequestMapping(value="/api/login",method= RequestMethod.GET)
	public boolean logar() {
		return true;
	}
	
	@RequestMapping(value="/api/user",method= RequestMethod.GET)
	public List<User> listUser() {
		return this.userRepository.findAll();
	}
	
	@RequestMapping(value="/api/user",method= RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	@RequestMapping(value="/user/{id}",method= RequestMethod.GET)
	public Optional<User> findById(@PathVariable String id) {
		return this.userRepository.findById(id);
	}
	
	@RequestMapping(value="/api/user/{nome}/nome",method= RequestMethod.GET)
	public List<User> findByNome(@PathVariable String nome) {
		return this.userRepository.findByNomeLikeIgnoreCase(nome);
	}
}
