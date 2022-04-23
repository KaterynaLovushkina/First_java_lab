package ua.lviv.iot.lab;

import ua.lviv.iot.lab.manager.Manager;
import ua.lviv.iot.lab.models.DataBase;
import ua.lviv.iot.lab.models.MemberForPermanentJob;
import ua.lviv.iot.lab.models.MemberForTemporaryJob;
import ua.lviv.iot.lab.models.PositionInformation;
import ua.lviv.iot.lab.writer.KinoStudioWriter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
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

        KinoStudioWriter.writeToFile1(DataBase.getMembers());

        List<PositionInformation> list2=new LinkedList<>();
        list2.add(new MemberForTemporaryJob("production designer","Lesya",28,"bachelor",5,350,6));
        list2.add(new MemberForTemporaryJob("operator","Oleksandr",35,"magister",11,550,6));
        list2.add(new MemberForTemporaryJob("actress","Nina",25,"bachelor",4,400,5));
        list2.add(new MemberForTemporaryJob("actor","Oleg",50,"magister",20,1000,4));
        KinoStudioWriter.writeToFile2(list2);

        List<PositionInformation> list3=new LinkedList<>();
        KinoStudioWriter.writeToFile3(list3);

    }
}