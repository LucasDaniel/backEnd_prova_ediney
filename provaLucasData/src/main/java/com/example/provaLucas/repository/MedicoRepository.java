package com.example.provaLucas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.provaLucas.entity.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
