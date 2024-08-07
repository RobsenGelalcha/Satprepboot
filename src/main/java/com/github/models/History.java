package com.github.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "sat_history")

public class History {

    @Id
    private int id;
    private int questionId;
    private String subject;
    private String prompt;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String answer;

    public History() {
    }

    public History(int id, String subject, String prompt, String A, String B, String C, String D, String E, String answer, String questionId){
        this.id = id;
        this.subject = subject;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.answer = answer;
    }



    public int getId() {
        return id;
    }

    public int getQuestionId(){
        return questionId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        this.A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        this.B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        this.C= c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        this.D = d;
    }

    public String getE() {
        return E;
    }

    public void setE(String e) {
        this.E = e;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
