package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.manager.Manager;

public class Main {
    public static void main(String[] args) {
        //DataBase.getMembers().forEach(System.out::println);
        Manager manager=new Manager();
        manager.findMembersForFilm("actress");
        manager.findMembersForFilm("actor");
        manager.findMembersForFilm("operator");
        manager.findMembersForFilm("art director");
        manager.findMembersForFilm("producer");

        System.out.println("-------------------------------------------------Staff for Documentary Film-----------------------------------------");
        manager.getStaffForFIlm().forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------------------------------------Staff for Documentary Film sorted by Work Experience-----------------------------------------");
        manager.sortByWorkExperience(false).forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------------------------------------Staff for Documentary Film sorted by Age-----------------------------------------");
        manager.sortByAge(true).forEach(System.out::println);





    }
}
