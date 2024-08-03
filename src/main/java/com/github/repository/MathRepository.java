package com.github.repository;

import com.github.models.Math;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
@Repository
public interface MathRepository extends MongoRepository<Math, String> {

    List<Math> findByExam(String exam);

    List<Math> findByQuestionId(int questionId);

    List<Math> findByOriginalQuestionNumber(int originalQuestionNumber);

    List<Math> findByQuestion(String question);

    List<Math> findBySectionLength(int sectionLength);

    List<Math> findBySectionNumber(int sectionNumber);

    List<Math> findByTags(String[] tags);

    List<Math> findByAnswer(String answer);

    List<Math> findByChoices(Map<String, String> choices);

    List<Math> findByExamAndQuestionId(String exam, int questionId);

    List<Math> findByExamAndOriginalQuestionNumber(String exam, int originalQuestionNumber);

    List<Math> findByExamAndQuestion(String exam, String question);

    List<Math> findByExamAndSectionLength(String exam, int sectionLength);
    
}
