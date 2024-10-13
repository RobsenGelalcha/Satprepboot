package com.github.robsengelalcha.Satprepboot.models;

public abstract class User {
    private String username;
    private String password;
    private String email;
    private String role;

    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}

/*
package com.github.robsengelalcha.Satprepboot.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Setter
@Getter
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

    public Math(String id,String answer,Map<String, String> choices,String exam,int questionId, int originalQuestionNumber,
                String question,int  sectionLength, int sectionNumber,String[] tags) {
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


}

 */



