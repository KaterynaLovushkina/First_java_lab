package ua.lviv.iot.lab2;


public abstract class FilmManager  {


    private static void sortByWorkExperienceInOrder(PositionInformation[] positionList){
        int i,j;
        PositionInformation tempMember;
        int len=positionList.length-1;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(positionList[j].getWorkExperience()>positionList[j+1].getWorkExperience()){
                    tempMember=positionList[j];
                    positionList[j]=positionList[j+1];
                    positionList[j+1]=tempMember;
                }
            }
        }
    }
    private static void sortByWorkExperienceReversed(PositionInformation[] positionList){
        int i,j;
        PositionInformation tempMember;
        int len=positionList.length-1;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(positionList[j].getWorkExperience()<positionList[j+1].getWorkExperience()){
                    tempMember=positionList[j];
                    positionList[j]=positionList[j+1];
                    positionList[j+1]=tempMember;
                }
            }
        }
    }
    private static void sortByNameInOrder(PositionInformation[] positionList) {
        int i, j;
        PositionInformation tempMember;
        int len = positionList.length - 1;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (positionList[j].getName().compareTo(positionList[j + 1].getName()) > 0) {
                    tempMember = positionList[j];
                    positionList[j] = positionList[j + 1];
                    positionList[j + 1] = tempMember;
                }
            }
        }
    }
    private static void sortByNameReversed(PositionInformation[] positionList) {
        int i, j;
        PositionInformation tempMember;
        int len = positionList.length - 1;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (positionList[j].getName().compareTo(positionList[j + 1].getName()) < 0) {
                    tempMember = positionList[j];
                    positionList[j] = positionList[j + 1];
                    positionList[j + 1] = tempMember;
                }
            }
        }
    }
    public static void sortMembers(int sortType,PositionInformation[] positionList){
        switch(sortType){
            case 1:
                System.out.println("Workers sorted by name in order:");
                sortByNameInOrder(positionList);
                displayPostMember(positionList);
                break;
            case 2:
                System.out.println("Workers sorted by name in reverse order:");
                sortByNameReversed(positionList);
                displayPostMember(positionList);
                break;
            case 3:
                System.out.println("Workers sorted by work experience in order:");
                sortByWorkExperienceInOrder(positionList);
                displayPostMember(positionList);
                break;
            case 4:
                System.out.println("Workers sorted by work experience in reversed order:");
                sortByWorkExperienceReversed(positionList);
                displayPostMember(positionList);
                break;
        }
    }
    public static void displayPostMember(PositionInformation[] positionList){
        for(PositionInformation member:positionList){
               System.out.println(member);
            }
    }


}
