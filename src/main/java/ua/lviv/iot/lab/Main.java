package ua.lviv.iot.lab;

import ua.lviv.iot.lab.manager.Manager;
import ua.lviv.iot.lab.models.DataBase;

public class Main {
    public static void main(String[] args) {
        //DataBase.getMembers().forEach(System.out::println);
        Manager manager=new Manager();
        manager.findMembersForFilm(DataBase.getMembers(),"actress");
        manager.findMembersForFilm(DataBase.getMembers(),"operator");
        manager.findMembersForFilm(DataBase.getMembers(),"actor");
        manager.findMembersForFilm(DataBase.getMembers(),"art director");
        manager.findMembersForFilm(DataBase.getMembers(),"producer");

        System.out.println("-------------------------------------------------Staff for Documentary Film-----------------------------------------");
        manager.getStaffForFIlm().forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------------------------------------Staff for Documentary Film sorted by Work Experience-----------------------------------------");
        manager.sortByWorkExperience(manager.getStaffForFIlm(),false).forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------------------------------------Staff for Documentary Film sorted by Age-----------------------------------------");
        manager.sortByAge(manager.getStaffForFIlm(),true).forEach(System.out::println);





    }
}