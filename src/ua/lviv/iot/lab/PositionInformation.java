package ua.lviv.iot.lab;

public abstract class PositionInformation {
    protected String name;
    protected int age;
    protected String educationDegree;
    protected int workExperience;
    protected int salaryInUAHperHour;
    protected int workingHoursPerDay;

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    public int getSalaryInUAHperHour() {
        return salaryInUAHperHour;
    }

    public void setSalaryInUAHperHour(int salaryInUAHperHour) {
        this.salaryInUAHperHour = salaryInUAHperHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionInformation(String name, int age,
                               String educationDegree, int workExperience,
                               int salaryInUAHperHour, int workingHoursPerDay) {
        this.name = name;
        this.age = age;
        this.educationDegree = educationDegree;
        this.workExperience = workExperience;
        this.salaryInUAHperHour = salaryInUAHperHour;
        this.workingHoursPerDay = workingHoursPerDay;
    }



}
