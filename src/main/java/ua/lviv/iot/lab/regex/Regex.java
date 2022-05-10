package ua.lviv.iot.lab.regex;


import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    String path;
    public Regex(String path) {
        this.path=path;
    }
    public String[] getTextFromFile() throws IOException {
        String[] sentances = new String[0];
        File file=new File(this.path);

        Scanner text = new Scanner(file);
        ArrayList<String> sentenceList = new ArrayList<String>();
        while (text.hasNextLine()) {
            sentenceList.add(text.nextLine());
        }
        text.close();
        String[] sentenceArray = sentenceList.toArray(new String[0]);
        for (int r = 0; r < sentenceArray.length; r++) {
            sentances = sentenceArray[r].split("(?<=[.!?])\\s*");
        }
        for (int i = 0; i < sentances.length; i++) {
            System.out.println("Sentence " + (i + 1) + ": " + sentances[i]);
        }
        return sentances;
    }

    public List<String> readFile() throws IOException {
        List<String> listOfText=new ArrayList<>();
        String[] text = getTextFromFile();
        List longestWordsList=findLongestWord();
        Pattern pattern = Pattern.compile("\\b(?i)[aieuo]\\w+");
        String str = "";
        int i=0;
        for (String s3 : text) {
            while(i<longestWordsList.size()) {
                str = s3.replaceFirst(pattern.pattern(),
                                      (String)  longestWordsList.get(i));
                listOfText.add(str);
                i++;
                break;
            }
            System.out.println(str);

        }
        return listOfText;
    }
    public List<String> findLongestWord() throws IOException {
        List<String> list=new ArrayList<>();
        String[] text = getTextFromFile();

        for (String words:text) {
            List<String> strings = Arrays.asList(words.split(" "));
            String biggestWord = Collections.max(strings,
                                                 Comparator.comparing(String::length));
            list.add(biggestWord);
            System.out.println(biggestWord);

        }
        return list;

    }


}

