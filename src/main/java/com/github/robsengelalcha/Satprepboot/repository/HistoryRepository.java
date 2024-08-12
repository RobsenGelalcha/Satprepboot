package com.github.robsengelalcha.Satprepboot.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


import com.github.robsengelalcha.Satprepboot.models.History;


@Repository
public interface HistoryRepository extends MongoRepository<History, String> {
    

    List<History> findByQuestionId(int questionId);

    List<History> findBySubject(String subject);
    
    List<History> findByPrompt(String prompt);
 
}