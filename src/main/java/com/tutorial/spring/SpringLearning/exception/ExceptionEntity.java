package com.tutorial.spring.SpringLearning.exception;

public class ExceptionEntity {

    private String issue;

    private String description;

    public ExceptionEntity(String issue, String description) {
        this.issue = issue;
        this.description = description;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ExceptionEntity{" +
                "issue='" + issue + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
