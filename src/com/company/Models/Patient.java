package com.company.Models;

public class Patient extends User{
    private String bloodType, history;
    private Integer height, weight;

    public Patient(String name, String surname, String age, String email, String password, String bloodType, String history, Integer height, Integer weight) {
        super(name, surname, age, email, password);
        this.bloodType = bloodType;
        this.history = history;
        this.height = height;
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
