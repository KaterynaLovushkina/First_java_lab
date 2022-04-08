package ua.lviv.iot.lab2.classmembers;

import ua.lviv.iot.lab2.PositionInformation;

public class Producer extends PositionInformation {
    protected String typeOfProducer;

    public Producer(String name, int age,
                    String educationDegree, int workExperience,
                    int salaryInUAHperHour, int workingHoursPerDay,String typeOfProducer) {
        super(name, age,  educationDegree, workExperience, salaryInUAHperHour, workingHoursPerDay);
        this.typeOfProducer=typeOfProducer;
    }
    @Override
    public String toString() {
        return "Film Producer{" +
                "Name:" + name + '\'' +
                ", Age:" + age +
                ", EducationDegree:" + educationDegree + '\'' +
                ", WorkExperience:" + workExperience +
                ", Email:" + name +"@com"+ '\'' +
                ", Salary:" + salaryInUAHperHour +
                ", WorkingHoursPerDay:" + workingHoursPerDay +
                ", Producer type:" + typeOfProducer +
                '}';
    }
}
