package com.github.controllers;

import com.github.models.Math;
import com.github.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping
    public List<Math> getAllMathQuestions() {
        return mathService.findAll();
    }

    @GetMapping("/exam/{exam}")
    public List<Math> getMathByExam(@PathVariable String exam) {
        return mathService.findByExam(exam);
    }

    @GetMapping("/questionId/{questionId}")
    public List<Math> getMathByQuestionId(@PathVariable int questionId) {
        return mathService.findByQuestionId(questionId);
    }

    @GetMapping("/originalQuestionNumber/{originalQuestionNumber}")
    public List<Math> getMathByOriginalQuestionNumber(@PathVariable int originalQuestionNumber) {
        return mathService.findByOriginalQuestionNumber(originalQuestionNumber);
    }

    @GetMapping("/question/{question}")
    public List<Math> getMathByQuestion(@PathVariable String question) {
        return mathService.findByQuestion(question);
    }

    @GetMapping("/sectionLength/{sectionLength}")
    public List<Math> getMathBySectionLength(@PathVariable int sectionLength) {
        return mathService.findBySectionLength(sectionLength);
    }
    @GetMapping("/test")
    public String testEndpoint() {
        return "API is working";
    }

    @GetMapping("/sectionNumber/{sectionNumber}")
    public List<Math> getMathBySectionNumber(@PathVariable int sectionNumber) {
        return mathService.findBySectionNumber(sectionNumber);
    }

    @GetMapping("/tags")
    public List<Math> getMathByTags(@RequestParam String[] tags) {
        return mathService.findByTags(tags);
    }

    @GetMapping("/answer/{answer}")
    public List<Math> getMathByAnswer(@PathVariable String answer) {
        return mathService.findByAnswer(answer);
    }

    @GetMapping("/choices")
    public List<Math> getMathByChoices(@RequestParam Map<String, String> choices) {
        return mathService.findByChoices(choices);
    }

    @GetMapping("/examAndQuestionId")
    public List<Math> getMathByExamAndQuestionId(@RequestParam String exam, @RequestParam int questionId) {
        return mathService.findByExamAndQuestionId(exam, questionId);
    }

    @GetMapping("/examAndOriginalQuestionNumber")
    public List<Math> getMathByExamAndOriginalQuestionNumber(@RequestParam String exam, @RequestParam int originalQuestionNumber) {
        return mathService.findByExamAndOriginalQuestionNumber(exam, originalQuestionNumber);
    }

    @GetMapping("/examAndQuestion")
    public List<Math> getMathByExamAndQuestion(@RequestParam String exam, @RequestParam String question) {
        return mathService.findByExamAndQuestion(exam, question);
    }

    @GetMapping("/examAndSectionLength")
    public List<Math> getMathByExamAndSectionLength(@RequestParam String exam, @RequestParam int sectionLength) {
        return mathService.findByExamAndSectionLength(exam, sectionLength);
    }
}

