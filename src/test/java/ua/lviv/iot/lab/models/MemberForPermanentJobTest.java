package ua.lviv.iot.lab.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberForPermanentJobTest {
    MemberForPermanentJob member;
    @BeforeEach
    void prepareData(){
         member=new MemberForPermanentJob("actress","Sylvia",30,"magister",9,25000);
    }
    @Test
    void testMemberGetNameMethod() {
        assertEquals("Sylvia",member.getName());
    }

    @Test
    void testMemberSetName() {
        member.setName("Olga");
        assertEquals("Sylvia",member.getName());
    }

    @Test
    void testMemberSetNameIsEmpty() {
        MemberForPermanentJob member=new MemberForPermanentJob("actress","",30,"magister",9,25000);
        member.setName("Olga");
        assertEquals("Olga",member.getName());
    }

    @Test
    void testMemberGetOccupationMethod() {
        assertEquals("actress",member.getOccupation());
    }

    @Test
    void testMemberGetAgeMethod() {
        assertEquals(30,member.getAge());
    }

    @Test
    void testMemberGetEducationDegreeMethod() {
        assertEquals("magister",member.getEducationDegree());
    }

    @Test
    void testMemberGetWorkExperienceMethod() {
        assertEquals(9,member.getWorkExperience());
    }

    @Test
    void testMemberSetOccupationMethod() {
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
    void testMembersetWorkExperienceMethod() {
        member.setWorkExperience(10);
        assertEquals(10,member.getWorkExperience());
    }

    @Test
    void testMembergetSalaryPerMonthsInUAHMethod() {
        assertEquals(25000,member.getSalaryPerMonthsInUAH());
    }

    @Test
    void testMembersetSalaryPerMonthsInUAHMethod() {
        member.setSalaryPerMonthsInUAH(30000);
        assertEquals(30000,member.getSalaryPerMonthsInUAH());

    }
    @Test
    void testMemberToStringMethod(){
        assertEquals("Member{ Occupation:'actress', Name:'Sylvia', Age:30, EducationDegree:'magister', WorkExperience:9  Salary per month:25000.0 UAH}",member.toString());

    }
}