package com.sparta.db.abstract_and_interfaces_lab;

public class JavaTrainee extends Trainee {

    private String github;

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void study(){
        System.out.println("Java Trainees Study wayyyy harder than Dev Ops Trainees");
    }

    public void train(){
        System.out.println("Java Trainees Study wayyyy harder than Dev Ops Trainees");
    }
}
