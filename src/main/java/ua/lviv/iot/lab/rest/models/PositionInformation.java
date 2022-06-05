package ua.lviv.iot.lab.rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@MappedSuperclass
public abstract class PositionInformation {
        @Id
        @GeneratedValue
        private Integer id;
        @Column(nullable = false, columnDefinition = "TEXT")
        private String occupation;
        @Column(nullable = false, columnDefinition = "TEXT")
        private  String  name;
        @Column(nullable = false)
        private int age;
        @Column(nullable = false, columnDefinition = "TEXT")
        private String educationDegree;
        @Column(nullable = false)
        private int workExperience;

        public PositionInformation() {
        }

        public PositionInformation(String occupation, String name,
                                   int age, String educationDegree,
                                   int workExperience) {
                this.occupation = occupation;
                this.name = name;
                this.age = age;
                this.educationDegree = educationDegree;
                this.workExperience = workExperience;
        }



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

