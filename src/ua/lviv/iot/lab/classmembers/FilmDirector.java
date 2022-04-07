package ua.lviv.iot.lab.classmembers;

import ua.lviv.iot.lab.PositionInformation;

enum FutureProjects{
    UKRAINEINFIRE,
    DARKCHRISTMAS,
    LIVEFOREVORE;
}
public class FilmDirector extends PositionInformation {
    protected FutureProjects futureCordinatedProjects;

    public FilmDirector(String name, int age,
                        String educationDegree, int workExperience,
                        int salaryInUAHperHour, int workingHoursPerDay) {
        super(name, age,  educationDegree, workExperience, salaryInUAHperHour, workingHoursPerDay);
    }

    @Override
    public String toString() {
        return "Film Director{" +
                "Name:" + name + '\'' +
                ", Age:" + age +
                ", EducationDegree:" + educationDegree + '\'' +
                ", WorkExperience:" + workExperience +
                ", Email:" + name +"@com"+ '\'' +
                ", Salary:" + salaryInUAHperHour +
                ", WorkingHoursPerDay:" + workingHoursPerDay +
                '}';
    }
}
