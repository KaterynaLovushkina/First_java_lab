
package ua.lviv.iot.lab.models;

import lombok.Getter;
import java.util.LinkedList;
import java.util.List;
@Getter
public abstract class DataBase {
    private static List<PositionInformation> staffList = new LinkedList<>();


    public static List<PositionInformation> getMembers() {
        staffList.add(new MemberForTemporaryJob("production designer", "Lesya",
                28, "bachelor", 5, 350, 6));
        staffList.add(new MemberForTemporaryJob("operator", "Oleksandr",
                                                35, "master", 11, 550, 6));
        staffList.add(new MemberForTemporaryJob("actress", "Nina", 25,
                                                "bachelor", 4, 400, 5));
        staffList.add(new MemberForTemporaryJob("actor", "Oleg", 50,
                                                "master", 20, 1000, 4));
        staffList.add(new MemberForTemporaryJob("actress", "Irina", 30,
                                                "master", 9, 500, 3));
        staffList.add(new MemberForTemporaryJob("script writer", "Kateryna",
                                                33, "master", 8, 300, 5));
        staffList.add(new MemberForTemporaryJob("accountant", "Nina", 25,
                                                "bachelor", 4, 400, 5));
        staffList.add(new MemberForTemporaryJob("operator", "Danilo", 29,
                                                "bachelor", 3, 300, 4));
        staffList.add(new MemberForTemporaryJob("actress", "Lucia", 35,
                                                "master", 10, 500, 4));
        staffList.add(new MemberForPermanentJob("director", "Vlad", 34,
                                                "bachelor", 5, 25000));
        staffList.add(new MemberForPermanentJob("director", "Solomiya", 45,
                                                "master", 17, 34000));
        staffList.add(new MemberForPermanentJob("art director", "Petro", 30,
                                                "bachelor", 5, 20000));
        staffList.add(new MemberForPermanentJob("producer", "Inga", 40,
                                                "master", 13, 40000));
       return staffList;
    }

}