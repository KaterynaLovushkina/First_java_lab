package ua.lviv.iot.lab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class PositionInformation {
        private String occupation;
        private  String  name;
        private int age;
        private String educationDegree;
        private int workExperience;

        public  String getHeaders() {
                return "occupation" + ","
                        + "name" + ","
                        + "age" + ","
                        + "education degree" + ","
                        + "work experience";
        }
        public String toCSV() {
                return occupation + ","
                        + name + ","
                        + age + ","
                        + educationDegree + ","
                        + workExperience;
        }

}

