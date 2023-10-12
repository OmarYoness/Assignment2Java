package ca.sheridancollege.yoness.assignment2java;

import lombok.Getter;

import java.util.Date;

@Getter
public class Poll {
    // Getters and Setters
    private int id;
    private String title;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private int votes1;
    private int votes2;
    private int votes3;
    private Date date;

    public Poll() {
        // Default constructor
    }

    public Poll(int id, String title, String question, String answer1, String answer2, String answer3,
                int votes1, int votes2, int votes3, Date date) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.votes1 = votes1;
        this.votes2 = votes2;
        this.votes3 = votes3;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setVotes1(int votes1) {
        this.votes1 = votes1;
    }

    public void setVotes2(int votes2) {
        this.votes2 = votes2;
    }

    public void setVotes3(int votes3) {
        this.votes3 = votes3;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Additional methods for voting statistics can be added here
    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", question='" + question + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", votes1=" + votes1 +
                ", votes2=" + votes2 +
                ", votes3=" + votes3 +
                ", date=" + date +
                '}';
    }
    public int getTotalVotes() {
        return votes1 + votes2 + votes3;
    }

    public double getPercentageVotes1() {
        return calculatePercentage(votes1);
    }

    public double getPercentageVotes2() {
        return calculatePercentage(votes2);
    }

    public double getPercentageVotes3() {
        return calculatePercentage(votes3);
    }

    private double calculatePercentage(int votes) {
        if (getTotalVotes() == 0) {
            return 0.0;
        }
        return ((double) votes / getTotalVotes()) * 100;
    }
}
