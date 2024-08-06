package com.github.controllers;

import com.github.models.History;
import com.github.services.HistoryService;
import com.github.services.MathService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/sat_history")
public class HistoryController {
    private final HistoryService historyService;


    // @Autowired
    // public MathController(MathService mathService) {
    //     this.mathService = mathService;
    // }

    @Autowired
    public HistoryController(HistoryService historyService){
        this.historyService = historyService;
    }
    @GetMapping
    public List<History> getAllHistoryQuestions(){
        return historyService.findAll();
    }

    @GetMapping("/exam/{exam}")
    public List<History> getHistoryByExam(@PathVariable String exam){
        return HistoryService.findByExam(exam);
    }
}
