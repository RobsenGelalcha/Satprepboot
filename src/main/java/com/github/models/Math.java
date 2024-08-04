package com.github.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Document(collection = "math")  
public class Math {

    @Id
    private String id;  

    private String answer;
    
    private Map<String, String> choices;

    private String exam;

    private int questionId;

    private int originalQuestionNumber;

    private String question;

    private int sectionLength;

    private int sectionNumber;

    private String[] tags;

    public Math(){

    }

    public Math(String id,String answer,Map<String, String> choices,String exam,int questionId, int originalQuestionNumber,String question,int  sectionLength, int sectionNumber,String[] tags) {
        this.id = id;
        this.answer = answer;
        this.choices = choices;
        this.exam = exam;
        this.questionId = questionId;
        this.originalQuestionNumber = originalQuestionNumber;
        this.question = question;
        this.sectionLength = sectionLength;
        this.sectionNumber = sectionNumber;
        this.tags = new String[tags.length];
        System.arraycopy(tags, 0, this.tags, 0, tags.length); 
    }




    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Map<String, String> getChoices() {
        return choices;
    }

    public void setChoices(Map<String, String> choices) {
        this.choices = choices;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getOriginalQuestionNumber() {
        return originalQuestionNumber;
    }

    public void setOriginalQuestionNumber(int originalQuestionNumber) {
        this.originalQuestionNumber = originalQuestionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getSectionLength() {
        return sectionLength;
    }

    public void setSectionLength(int sectionLength) {
        this.sectionLength = sectionLength;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}

