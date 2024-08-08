package com.github.controllers;

import com.github.models.History;
import com.github.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sat_history")
public class HistoryController {
    private final HistoryService historyService;



    @Autowired
    public HistoryController(HistoryService historyService){
        this.historyService = historyService;
    }
    @GetMapping
    public List<History> getAllHistoryQuestions(){
        return historyService.findAll();
    }

    @GetMapping("/questionId/{questionId}")
    public List<History> getHistoryByQuestionId@PathVariable int questionId){
        return HistoryService.findByQuestionId(questionId);
    }
}
