package com.github.robsengelalcha.Satprepboot.services;
import com.github.robsengelalcha.Satprepboot.models.Math;
import com.github.robsengelalcha.Satprepboot.repository.MathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;


@Service
public class MathService {

    
    private final MathRepository mathRepository;

    @Autowired
    public MathService(MathRepository mathRepository) {
        this.mathRepository = mathRepository;

    }

    public List<Math> findAll() {
        return mathRepository.findAll();
    }

    public List<Math> findByExam(String exam) {
        return mathRepository.findByExam(exam);

    }

    public List<Math> findByQuestionId(int questionId) {
        return mathRepository.findByQuestionId(questionId);
    }

    public List<Math> findByOriginalQuestionNumber(int originalQuestionNumber) {
        return mathRepository.findByOriginalQuestionNumber(originalQuestionNumber);
    }

    public List<Math> findByQuestion(String question) {
        return mathRepository.findByQuestion(question);
    }

    public List<Math> findBySectionLength(int sectionLength) {
        return mathRepository.findBySectionLength(sectionLength);
    }

    public List<Math> findBySectionNumber(int sectionNumber) {
        return mathRepository.findBySectionNumber(sectionNumber);
    }

    public List<Math> findByTags(String[] tags) {
        return mathRepository.findByTags(tags);
    }

    public List<Math> findByAnswer(String answer) {
        return mathRepository.findByAnswer(answer);
    }

    public List<Math> findByChoices(Map<String, String> choices) {
        return mathRepository.findByChoices(choices);
    }

    public List<Math> findByExamAndQuestionId(String exam, int questionId) {
        return mathRepository.findByExamAndQuestionId(exam, questionId);
    }

    public List<Math> findByExamAndOriginalQuestionNumber(String exam, int originalQuestionNumber) {
        return mathRepository.findByExamAndOriginalQuestionNumber(exam, originalQuestionNumber);
    }

    public List<Math> findByExamAndQuestion(String exam, String question) {
        return mathRepository.findByExamAndQuestion(exam, question);
    }

    public List<Math> findByExamAndSectionLength(String exam, int sectionLength) {
        return mathRepository.findByExamAndSectionLength(exam, sectionLength);
    }
    
}
