package ua.lviv.iot.lab.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class DataBase {
     static List<PositionInformation> staffList;
    public static List<PositionInformation> getMembers(){
        staffList=new LinkedList<PositionInformation>();
        staffList.add(new MemberForTemporaryJob("production designer","Lesya",28,"bachelor",5,350,6));
        staffList.add(new MemberForTemporaryJob("operator","Oleksandr",35,"magister",11,550,6));
        staffList.add(new MemberForTemporaryJob("actress","Nina",25,"bachelor",4,400,5));
        staffList.add(new MemberForTemporaryJob("actor","Oleg",50,"magister",20,1000,4));
        staffList.add(new MemberForTemporaryJob("actress","Irina",30,"magister",9,500,3));
        staffList.add(new MemberForTemporaryJob("script writer","Kateryna",33,"magister",8,300,5));
        staffList.add(new MemberForTemporaryJob("accountant","Nina",25,"bachelor",4,400,5));
        staffList.add(new MemberForTemporaryJob("operator","Danilo",29,"bachelor",3,300,4));
        staffList.add(new MemberForTemporaryJob("actress","Lucia",35,"magister",10,500,4));
        staffList.add(new MemberForPermanentJob("director","Vlad",34,"bachelor",5,25000));
        staffList.add(new MemberForPermanentJob("director","Solomiya",45,"magister",17,34000));
        staffList.add(new MemberForPermanentJob("art director","Petro",30,"bachelor",5,20000));
        staffList.add(new MemberForPermanentJob("producer","Inga",40,"magister",13,40000));

        return staffList;
    }
}