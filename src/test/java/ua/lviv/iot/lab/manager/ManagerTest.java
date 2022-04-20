package ua.lviv.iot.lab.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab.models.DataBase;
import ua.lviv.iot.lab.models.MemberForTemporaryJob;
import ua.lviv.iot.lab.models.PositionInformation;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//import static ua.lviv.iot.lab.models.DataBase.staffList;

class ManagerTest  {
    public Manager manager;
    List<PositionInformation> listForFilm=new LinkedList<PositionInformation>();
    @BeforeEach
    void setUp(){
        manager=new Manager();
        listForFilm.add(new MemberForTemporaryJob("actress","Irina",30,"magister",9,500,3));
        listForFilm.add(new MemberForTemporaryJob("script writer","Kateryna",33,"magister",8,300,5));
        listForFilm.add(new MemberForTemporaryJob("accountant","Nina",25,"bachelor",4,400,5));
        listForFilm.add(new MemberForTemporaryJob("operator","Danilo",29,"bachelor",3,300,4));
        listForFilm.add(new MemberForTemporaryJob("actress","Lucia",35,"magister",10,500,4));
        listForFilm.add(new MemberForTemporaryJob("actress","Nadiya",34,"bachelor",5,400,3));
    }

    //List<PositionInformation> memberList;

    @Test
    void testFindMembersForFilm() {
        manager.findMembersForFilm(listForFilm,"operator");
        manager.findMembersForFilm(listForFilm,"actress");
        manager.findMembersForFilm(listForFilm,"accountant");
        assertEquals(4,manager.staffForFIlm.size());
    }

    @Test
    void testSortByWorkExperienceAsc() {
        List<PositionInformation>sortedListOrdered=manager.sortByWorkExperience(listForFilm,false);
        assertEquals(3,sortedListOrdered.get(0).getWorkExperience());
        assertEquals(4,sortedListOrdered.get(1).getWorkExperience());
        assertEquals(5,sortedListOrdered.get(2).getWorkExperience());
        assertEquals(8,sortedListOrdered.get(3).getWorkExperience());
        assertEquals(9,sortedListOrdered.get(4).getWorkExperience());
        assertEquals(10,sortedListOrdered.get(5).getWorkExperience());
    }

    @Test
    void testSortByWorkExperienceDesk() {
        List<PositionInformation>sortedListReversed=manager.sortByWorkExperience(listForFilm,true);
        assertEquals(10,sortedListReversed.get(0).getWorkExperience());
        assertEquals(9,sortedListReversed.get(1).getWorkExperience());
        assertEquals(8,sortedListReversed.get(2).getWorkExperience());
        assertEquals(5,sortedListReversed.get(3).getWorkExperience());
        assertEquals(4,sortedListReversed.get(4).getWorkExperience());
        assertEquals(3,sortedListReversed.get(5).getWorkExperience());
    }

    @Test
    void testSortByAgeAsk() {
        List<PositionInformation>sortedListOrdered=manager.sortByAge(listForFilm,false);
        assertEquals(25,sortedListOrdered.get(0).getAge());
        assertEquals(29,sortedListOrdered.get(1).getAge());
        assertEquals(30,sortedListOrdered.get(2).getAge());
        assertEquals(33,sortedListOrdered.get(3).getAge());
        assertEquals(34,sortedListOrdered.get(4).getAge());
        assertEquals(35,sortedListOrdered.get(5).getAge());
    }

    @Test
    void testSortByAgeDesk() {
        List<PositionInformation>sortedListReversed=manager.sortByAge(listForFilm,true);
        assertEquals(35,sortedListReversed.get(0).getAge());
        assertEquals(34,sortedListReversed.get(1).getAge());
        assertEquals(33,sortedListReversed.get(2).getAge());
        assertEquals(30,sortedListReversed.get(3).getAge());
        assertEquals(29,sortedListReversed.get(4).getAge());
        assertEquals(25,sortedListReversed.get(5).getAge());
    }
}