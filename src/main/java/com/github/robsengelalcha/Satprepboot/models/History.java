package com.github.robsengelalcha.Satprepboot.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Document(collection = "sat_history")
public class History {

    @Id
    private int id;
    private int questionId;
    @Setter
    private String subject;
    @Setter
    private String prompt;
    @Setter
    private String A;
    @Setter
    private String B;
    @Setter
    private String C;
    @Setter
    private String D;
    @Setter
    private String E;
    @Setter
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


}
