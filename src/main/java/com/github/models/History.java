package com.github.models;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
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

    public History(int id, String subject, String prompt, String A, String B, String C, String D, String E, String answer, int questionId){
        this.id = id;
        this.subject = subject;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.answer = answer;
        this.questionId = questionId;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setA(String a) {
        this.A = a;
    }

    public void setB(String b) {
        this.B = b;
    }

    public void setC(String c) {
        this.C= c;
    }

    public void setD(String d) {
        this.D = d;
    }

    public void setE(String e) {
        this.E = e;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
