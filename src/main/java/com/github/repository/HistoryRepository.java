package com.github.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.github.models.History;


@Repository
public interface HistoryRepository extends MongoRepository<History, String> {
    
    List<History> findById(int id);

    List<History> findByQuestionId(int questionId);

    List<History> findBySubject(String subject);

    List<History> findByPrompt(String prompt);
 
}