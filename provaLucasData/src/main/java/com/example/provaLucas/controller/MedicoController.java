package com.example.provaLucas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaLucas.entity.Medico;
import com.example.provaLucas.repository.MedicoRepository;

@RestController
public class MedicoController {

	@Autowired
	MedicoRepository medicoRepository;	
	
	@RequestMapping(value="/api/medico",method= RequestMethod.GET)
	public List<Medico> listMedico() {
		return this.medicoRepository.findAll();
	}
	
	@RequestMapping(value="/api/medico",method= RequestMethod.POST)
	public Medico saveUser(@RequestBody Medico medico) {
		return this.medicoRepository.save(medico);
	}
	
	@RequestMapping(value="/api/medico/{id}",method= RequestMethod.GET)
	public Optional<Medico> findById(@PathVariable String id) {
		return this.medicoRepository.findById(id);
	}
	
}
