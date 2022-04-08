package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.classmembers.CastMember;
import ua.lviv.iot.lab2.classmembers.FilmDirector;
import ua.lviv.iot.lab2.classmembers.Producer;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        PositionInformation[] position=new PositionInformation[6];

        position[0]=new CastMember("Petro", 40,  "master", 15, 350, 35, "operator");
        position[1]=new CastMember("Lucy", 30,  "bachelor", 3, 200, 40, "desgnerir");
        position[2]=new CastMember("Andriy", 54,  "master", 22, 500, 48, "actor");
        position[3]=new CastMember("Olena", 35,  "master", 7, 250, 48, "actress");
        position[4]=new FilmDirector("John", 33,  "master", 9, 450, 40);
        position[5] =new Producer("Stepan", 50,  "master", 23, 500, 40, "Consulting producer");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the method you would like to choice: ");
        System.out.println("1. Sort array by name in order");
        System.out.println("2. Sort array by name in reverse order");
        System.out.println("3. Sort array by work experience in order");
        System.out.println("4. Sort array by work experience in reverse order");
        System.out.println("Please make your choice:");
        int sortType = sc.nextInt();
        FilmManager.sortMembers(sortType,position);


    }
}
