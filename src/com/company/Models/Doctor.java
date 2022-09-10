package com.company.Models;

public class Doctor extends User{

    private String description, experience, specialization;

    public Doctor(String name, String surname, String age, String email, String password,
                  String description, String experience, String specialization) {
        super(name, surname, age, email, password);
        this.description = description;
        this.experience = experience;
        this.specialization = specialization;
    }

    public void addAppointment(){

    }

    public void complete(){

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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
