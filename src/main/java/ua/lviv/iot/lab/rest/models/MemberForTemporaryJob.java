package ua.lviv.iot.lab.rest.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@Data
@Entity
@Table(name = "members")
public class  MemberForTemporaryJob extends PositionInformation {
    @Column(nullable = false, columnDefinition = "TEXT")
    private int salaryInUAHperHour;
    @Column(nullable = false, columnDefinition = "TEXT")
    private int workingHoursPerDay;

    public MemberForTemporaryJob(final String occupation,
                                 final String name,
                                 final int age,
                                 final String educationDegree,
                                 final int workExperience,
                                 final int salaryInUAHperHour,
                                 final int workingHoursPerDay) {
        super(occupation, name, age, educationDegree, workExperience);
        this.salaryInUAHperHour = salaryInUAHperHour;
        this.workingHoursPerDay = workingHoursPerDay;

    }

    public MemberForTemporaryJob() {

    }


    @Override
    public String toString() {
        return "Member{"
                +  " Occupation:'" + this.getOccupation() + '\''
                +  ", Name:'" + this.getName() + '\''
                + ", Age:" + this.getAge()
                + ", Education degree:'" + this.getEducationDegree() + '\''
                + ", Work experience:" + this.getWorkExperience()
                + " Salary per hour:" + salaryInUAHperHour + " UAH"
                + ", Working hours per day:" + workingHoursPerDay
                + '}';
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ","
                + "salary in UAH per Hour" + ","
                + "working hours per day";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ","
                + getSalaryInUAHperHour() + ","
                + getWorkingHoursPerDay();
    }
}