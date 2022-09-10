package com.company.Models;

public class Nurse extends User{
    private String description, experience;

    public Nurse(String name, String surname, String age, String email, String password, String description, String experience) {
        super(name, surname, age, email, password);
        this.description = description;
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
