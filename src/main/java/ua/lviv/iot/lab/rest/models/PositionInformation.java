package ua.lviv.iot.lab.rest.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;


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

        public PositionInformation(final String occupation,
                                   final String name,
                                   final int age,
                                   final String educationDegree,
                                   final int workExperience) {
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

