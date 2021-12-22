package com.example.provaLucas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaLucas.entity.Prescricao;
import com.example.provaLucas.repository.PrescricaoRepository;

@RestController
public class PrescricaoController {

	@Autowired
	PrescricaoRepository prescricaoRepository;	
	
	@RequestMapping(value="/api/prescricao",method= RequestMethod.GET)
	public List<Prescricao> listprescricao() {
		return this.prescricaoRepository.findAll();
	}
	
	@RequestMapping(value="/api/prescricao",method= RequestMethod.POST)
	public Prescricao saveprescricao(@RequestBody Prescricao prescricao) {
		return this.prescricaoRepository.save(prescricao);
	}
	
	@RequestMapping(value="/api/prescricao/{id}",method= RequestMethod.GET)
	public Optional<Prescricao> findById(@PathVariable String id) {
		return this.prescricaoRepository.findById(id);
	}
	
}
