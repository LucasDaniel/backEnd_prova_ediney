package com.example.provaLucas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.provaLucas.entity.Remedio;

public interface RemedioRepository extends MongoRepository<Remedio, String> {

}
