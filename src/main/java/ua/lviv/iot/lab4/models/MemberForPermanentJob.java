package ua.lviv.iot.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MemberForPermanentJob extends PositionInformation {
    private WorkingProjects workingProjects;
    private double salaryPerMonthsInUAH;

    public MemberForPermanentJob(String occupation, String name, int age, String educationDegree, int workExperience,double salaryPerMonthsInUAH) {
        super(occupation, name, age, educationDegree, workExperience);
        this.salaryPerMonthsInUAH=salaryPerMonthsInUAH;
    }
    @Override
    public String toString() {
        return "Member{" +
                " Occupation:'" +this.getOccupation() + '\'' +
                ", Name:'" + this.getName() + '\'' +
                ", Age:" + this.getAge() +
                ", EducationDegree:'" + this.getEducationDegree() + '\'' +
                ", WorkExperience:" + this.getWorkExperience() +
                "  Salary per month:" + salaryPerMonthsInUAH+" UAH" +
                '}';
    }

}
