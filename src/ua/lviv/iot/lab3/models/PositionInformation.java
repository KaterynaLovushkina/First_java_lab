package ua.lviv.iot.lab.models;

public abstract class PositionInformation {
    private String occupation;
    private String name;
    private int age;
    private String educationDegree;
    private int workExperience;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public PositionInformation(String occupation, String name, int age, String educationDegree, int workExperience) {
        this.occupation = occupation;
        this.name = name;
        this.age = age;
        this.educationDegree = educationDegree;
        this.workExperience = workExperience;
    }



}
