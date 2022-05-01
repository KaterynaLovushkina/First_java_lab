package ua.lviv.iot.lab.models;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberForPermanentJob extends PositionInformation {
    private double salaryPerMonthsInUAH;
    public MemberForPermanentJob(final String occupation,
                                  final String name,
                                  final int age,
                                  final String educationDegree,
                                  final int workExperience,
                                  final double salaryPerMonthsInUAH) {
        super(occupation, name, age, educationDegree, workExperience);
        this.salaryPerMonthsInUAH = salaryPerMonthsInUAH;
    }
    @Override
    public String toString() {
        return "Member{"
                + " Occupation:'" + this.getOccupation() + '\''
                + ", Name:'" + this.getName() + '\''
                + ", Age:" + this.getAge()
                + ", Education Degree:'" + this.getEducationDegree() + '\''
                + ", Work Experience:" + this.getWorkExperience()
                + "  Salary per month:" + salaryPerMonthsInUAH + " UAH"
                + '}';
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "salary per month in UAH";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ","
                + getSalaryPerMonthsInUAH();
    }
}