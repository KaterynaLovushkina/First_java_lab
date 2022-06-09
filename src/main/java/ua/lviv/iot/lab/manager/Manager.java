package ua.lviv.iot.lab.manager;


import lombok.Getter;
import ua.lviv.iot.lab.rest.models.PositionInformation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
@Getter
public final class Manager {
    private final List<PositionInformation> staffForFIlm = new ArrayList<>();

    public List<PositionInformation> findMembersForFilm(
            final List<PositionInformation> listOfMembers,
            final String occupation) {
        final List<PositionInformation> temp = new ArrayList<>();
        long occurrences = IntStream.range(0, listOfMembers.size())
                .filter(i -> occupation.equals(listOfMembers.get(i)
                .getOccupation()))
                .count();
        for (PositionInformation member:listOfMembers) {
            if (member.getOccupation().equals(occupation)) {
                if (occurrences < 3) {
                    staffForFIlm.add(member);
                }
                if (occurrences >= 3) {
                    temp.add(member);
                    List<PositionInformation> sortedTemp = temp.stream()
                            .sorted(Comparator
                            .comparing(PositionInformation::getWorkExperience))
                            .collect(Collectors.toList());
                    if (sortedTemp.size() >= 3) {
                        sortedTemp.remove(temp.size() - 1);
                        staffForFIlm.addAll(sortedTemp);
                    }
                }
            }
        }
        return getStaffForFIlm();
    }
    public List<PositionInformation> sortByWorkExperience(
            final List<PositionInformation> sortedlist,
            boolean isDescendingOrder) {
        final List<PositionInformation> sortedStaff;
        if (isDescendingOrder) {
            sortedStaff = sortedlist.stream()
                    .sorted(Comparator
                    .comparing(PositionInformation::getWorkExperience)
                            .reversed())
                    .collect(Collectors.toList());
        }
        else {
            sortedStaff = sortedlist.stream()
                    .sorted(Comparator
                    .comparing(PositionInformation::getWorkExperience))
                    .collect(Collectors.toList());
        }
        return sortedStaff;
    }
    public List<PositionInformation> sortByAge(
            final List<PositionInformation> sortedlist,
            boolean isDescendingOrder) {
        List<PositionInformation> sortedStaff;
        if (isDescendingOrder) {
            sortedStaff = sortedlist.stream()
                    .sorted(Comparator
                    .comparing(PositionInformation::getAge).reversed())
                    .collect(Collectors.toList());
        }
        else {
            sortedStaff = sortedlist.stream()
                    .sorted(Comparator
                    .comparing(PositionInformation::getAge))
                    .collect(Collectors.toList());
        }
        return sortedStaff;

    }
}