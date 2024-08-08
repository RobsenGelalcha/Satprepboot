package com.github.services;
import com.github.models.History;
import com.github.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class HistoryService {

    private HistoryRepository historyRepository;

    @Autowired
    public HistoryService(HistoryRepository historyRepository) {

}


public List<History> findAll() {
    return historyRepository.findAll();
}

public List<History> findByQuestionId(int questionId){
    return historyRepository.findByQuestionId(questionId);
}

public List<History> findBySubject(String subject){
    return historyRepository.findBySubject(subject);
}

public List<History> findByPrompt(String prompt){
    return historyRepository.findByPrompt(prompt);
}

 





}
