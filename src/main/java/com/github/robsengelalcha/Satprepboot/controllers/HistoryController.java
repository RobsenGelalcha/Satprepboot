

package com.github.robsengelalcha.Satprepboot.controllers;

import com.github.robsengelalcha.Satprepboot.models.History;
import com.github.robsengelalcha.Satprepboot.services.HistoryService;
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
    public List<History> getHistoryByQuestionId(@PathVariable int questionId){
        return historyService.findByQuestionId(questionId);
    }
    
    @GetMapping("/subject/{subject}")
    public List<History> getHistoryBySubject(@PathVariable String subject){
        return historyService.findBySubject(subject);
    }

    @GetMapping("/prompt/{prompt}")
    public List<History> getHistoryByPrompt(@PathVariable String prompt){
        return historyService.findByPrompt(prompt);
    }
}
