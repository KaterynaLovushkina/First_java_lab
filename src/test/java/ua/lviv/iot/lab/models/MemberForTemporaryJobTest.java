package ua.lviv.iot.lab.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberForTemporaryJobTest {

    MemberForTemporaryJob member;
    @BeforeEach
    void prepareData(){
        member=new MemberForTemporaryJob("actress","Sylvia",30,"magister",9,200,6);
    }
    @Test
    void testMemberGetNameMethod() {
        assertEquals("Sylvia",member.getName());
    }

    @Test
    void testMemberSetNameMethod() {
        member.setName("Olga");
        assertEquals("Sylvia",member.getName());
    }

    @Test
    void testMemberSetNameIsEmptyMethod() {
        MemberForTemporaryJob member=new MemberForTemporaryJob("actress","",30,"magister",9,200,6);
        member.setName("Olga");
        assertEquals("Olga",member.getName());
    }

    @Test
    void testMembergetOccupationMethod() {
        assertEquals("actress",member.getOccupation());
    }

    @Test
    void testMembergetAgeMethod() {
        assertEquals(30,member.getAge());
    }

    @Test
    void testMembergetEducationDegreeMethod() {
        assertEquals("magister",member.getEducationDegree());
    }

    @Test
    void testMembergetWorkExperienceMethod() {
        assertEquals(9,member.getWorkExperience());
    }

    @Test
    void testMembersetOccupationMethod() {
        member.setOccupation("designer");
        assertEquals("designer",member.getOccupation());
    }

    @Test
    void testMemberSetAgeMethod() {
        member.setAge(31);
        assertEquals(31,member.getAge());
    }

    @Test
    void testMemberSetEducationDegreeMethod() {
        member.setEducationDegree("bachelor");
        assertEquals("bachelor",member.getEducationDegree());
    }

    @Test
    void testMemberSetWorkExperienceMethod() {
        member.setWorkExperience(10);
        assertEquals(10,member.getWorkExperience());
    }

    @Test
    void testMemberGetSalaryInUAHperHourMethod() {
        assertEquals(200,member.getSalaryInUAHperHour());
    }

    @Test
    void testMemberGetWorkingHoursPerDayMethod() {
        assertEquals(6,member.getWorkingHoursPerDay());
    }

    @Test
    void testMemberSetSalaryInUAHperHourMethod() {
        member.setSalaryInUAHperHour(300);
        assertEquals(300,member.getSalaryInUAHperHour());
    }

    @Test
    void testMemberSetWorkingHoursPerDayMethod() {
        member.setWorkingHoursPerDay(5);
        assertEquals(5,member.getWorkingHoursPerDay());
    }
    @Test
    void testMemberToStringMethod(){
        assertEquals("Member{ Occupation:'actress', Name:'Sylvia', Age:30, Education degree:'magister', Work experience:9 Salary per hour:200 UAH, Working hours per day:6}",member.toString());
    }
    @Test
    void getHeaders() {
        assertEquals("occupation,name,age,education degree,work experience,salary in UAH per Hour,working hours per day",member.getHeaders());
    }
    @Test
    void toCSV(){
        assertEquals("actress,Sylvia,30,magister,9,200,6",member.toCSV());
    }

}