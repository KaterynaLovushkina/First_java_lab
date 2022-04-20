package ua.lviv.iot.lab.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberForTemporaryJob extends PositionInformation {
    private int salaryInUAHperHour;
    private int workingHoursPerDay;

    public MemberForTemporaryJob(String occupation, String name, int age,
                                 String educationDegree, int workExperience,
                                 int salaryInUAHperHour, int workingHoursPerDay) {
        super(occupation, name, age, educationDegree, workExperience);
        this.salaryInUAHperHour = salaryInUAHperHour;
        this.workingHoursPerDay = workingHoursPerDay;
    }

    @Override
    public String toString() {
        return "Member{" +
                " Occupation:'" + this.getOccupation() + '\'' +
                ", Name:'" + this.getName() + '\'' +
                ", Age:" + this.getAge() +
                ", EducationDegree:'" + this.getEducationDegree() + '\'' +
                ", WorkExperience:" + this.getWorkExperience() +
                " Salary per hour:" + salaryInUAHperHour + " UAH" +
                ", WorkingHoursPerDay:" + workingHoursPerDay +
                '}';

    }
}