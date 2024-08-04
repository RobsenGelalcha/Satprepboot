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





}
