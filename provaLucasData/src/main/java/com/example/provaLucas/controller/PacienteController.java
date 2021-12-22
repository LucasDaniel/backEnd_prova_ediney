package com.example.provaLucas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaLucas.entity.Paciente;
import com.example.provaLucas.repository.PacienteRepository;

@RestController
public class PacienteController {

	@Autowired
	PacienteRepository pacienteRepository;	
	
	@RequestMapping(value="/api/paciente",method= RequestMethod.GET)
	public List<Paciente> listPaciente() {
		return this.pacienteRepository.findAll();
	}
	
	@RequestMapping(value="/api/paciente",method= RequestMethod.POST)
	public Paciente savePaciente(@RequestBody Paciente paciente) {
		return this.pacienteRepository.save(paciente);
	}
	
	@RequestMapping(value="/api/paciente/{id}",method= RequestMethod.GET)
	public Optional<Paciente> findById(@PathVariable String id) {
		return this.pacienteRepository.findById(id);
	}
	
}
