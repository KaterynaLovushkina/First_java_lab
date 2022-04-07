package ua.lviv.iot.lab.classmembers;

import ua.lviv.iot.lab.PositionInformation;

public  class CastMember extends PositionInformation {
    protected String occupation;
    public CastMember(String name, int age,
                      String educationDegree, int workExperience,
                      int salaryInUAHperHour, int workingHoursPerDay,String occupation) {
        super(name, age, educationDegree, workExperience, salaryInUAHperHour, workingHoursPerDay);
        this.occupation=occupation;
    }


    @Override
    public String toString() {
        return "CastMember{" +
                "Occupation:" + occupation + '\'' +
                ", Name:" + name + '\'' +
                ", Age:" + age +
                ", EducationDegree:" + educationDegree + '\'' +
                ", WorkExperience:" + workExperience +
                ", Email:" + name +"@com"+ '\'' +
                ", Salary:" + salaryInUAHperHour +
                ", WorkingHoursPerDay:" + workingHoursPerDay +
                '}';
    }
}
