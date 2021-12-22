package com.example.provaLucas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.provaLucas.entity.Prescricao;

public interface PrescricaoRepository extends MongoRepository<Prescricao, String> {

}
