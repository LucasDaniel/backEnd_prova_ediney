package com.example.provaLucas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.provaLucas.entity.Paciente;

public interface PacienteRepository extends MongoRepository<Paciente, String> {

}
