package com.github.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.models.History;



public interface HistoryRepository extends MongoRepository<History, String> {
    
    
}