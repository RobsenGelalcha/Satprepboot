package com.github.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MathRepository extends MongoRepository<Math, String> {
    
}
