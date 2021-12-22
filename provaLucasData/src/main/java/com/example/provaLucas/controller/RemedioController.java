package com.example.provaLucas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaLucas.entity.Remedio;
import com.example.provaLucas.repository.RemedioRepository;

@RestController
public class RemedioController {

	@Autowired
	RemedioRepository remedioRepository;	
	
	@RequestMapping(value="/api/remedio",method= RequestMethod.GET)
	public List<Remedio> listRemedio() {
		return this.remedioRepository.findAll();
	}
	
	@RequestMapping(value="/api/remedio",method= RequestMethod.POST)
	public Remedio saveRemedio(@RequestBody Remedio remedio) {
		return this.remedioRepository.save(remedio);
	}
	
	@RequestMapping(value="/api/remedio/{id}",method= RequestMethod.GET)
	public Optional<Remedio> findById(@PathVariable String id) {
		return this.remedioRepository.findById(id);
	}
	
}
