package com.github.robsengelalcha.Satprepboot.models;
import java.util.Date;


public class Student extends User{

    private int totalScore;

    private Date joinDate;

    private Date lastLogin;

    private Date examDate;

    private int numExamsTaken;  //number of exams taken so far

    private float avgScore;
    public Student() {
    }
    public Student(String username, String password, String email, String role, int totalScore,
                   Date joinDate, Date lastLogin, Date examDate, int numExamsTaken, float avgScore) {
        super(username, password, email, role);
        this.totalScore = totalScore;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
        this.examDate = examDate;
        this.numExamsTaken = numExamsTaken;
        this.avgScore = avgScore;
    }
}
