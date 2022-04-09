
package ua.lviv.iot.lab3.manager;

import ua.lviv.iot.lab3.models.DataBase;
import ua.lviv.iot.lab3.models.PositionInformation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Manager {
    List<PositionInformation> staffForFIlm=new ArrayList<>();

    public List<PositionInformation> getStaffForFIlm() {
        return staffForFIlm;
    }


    public List<PositionInformation> findMembersForFilm(String occupation){
        List<PositionInformation> temp=new ArrayList<>();
        long occurrences = IntStream.range(0, DataBase.getMembers().size())
                .filter(i -> occupation.equals(DataBase.getMembers().get(i).getOccupation()))
                .count();
        for(PositionInformation member:DataBase.getMembers()){
            if(member.getOccupation().equals(occupation)) {
                if(occurrences<3){
                    staffForFIlm.add(member);
                }
                if(occurrences>=3){
                    temp.add(member);
                    List<PositionInformation> sortedTemp=temp.stream()
                            .sorted(Comparator.comparing(PositionInformation::getWorkExperience))
                            .collect(Collectors.toList());
                    if(sortedTemp.size()>=3) {
                        sortedTemp.remove(temp.size() - 1);
                        staffForFIlm.addAll(sortedTemp);
                    }
                }
                }
            }
        return staffForFIlm;

    }
    public List<PositionInformation> sortByWorkExperience( boolean isDescendingOrder){
        List<PositionInformation> sortedStaff;
        if(isDescendingOrder==true){
             sortedStaff=staffForFIlm.stream()
                    .sorted(Comparator.comparing(PositionInformation::getWorkExperience).reversed())
                    .collect(Collectors.toList());
        }
        else{
              sortedStaff=staffForFIlm.stream()
                .sorted(Comparator.comparing(PositionInformation::getWorkExperience))
                .collect(Collectors.toList());
    }
        return sortedStaff;
    }
    public List<PositionInformation> sortByAge(boolean isDescendingOrder){
        List<PositionInformation> sortedStaff;
        if(isDescendingOrder==true) {
            sortedStaff = staffForFIlm.stream()
                    .sorted(Comparator.comparing(PositionInformation::getAge).reversed())
                    .collect(Collectors.toList());
        }
        else{
            sortedStaff=staffForFIlm.stream()
                    .sorted(Comparator.comparing(PositionInformation::getAge))
                    .collect(Collectors.toList());
        }
        return sortedStaff;
    }
    }


