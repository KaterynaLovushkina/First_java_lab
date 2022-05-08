package ua.lviv.iot.lab.regex;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Regex {
    String path;
    public Regex(String path) {
        this.path=path;
    }
    public String[] getTextFromFile() throws IOException {
        String[] SENTENCE = new String[0];
        File file=new File(this.path);

        Scanner sentence = new Scanner(file);
        ArrayList<String> sentenceList = new ArrayList<String>();
        while (sentence.hasNextLine()) {
            sentenceList.add(sentence.nextLine());
        }
        sentence.close();
        String[] sentenceArray = sentenceList.toArray(new String[0]);
        for (int r = 0; r < sentenceArray.length; r++) {
            SENTENCE = sentenceArray[r].split("(?<=[.!?])\\s*"); //split sentences and store in array
        }
        for (int i = 0; i < SENTENCE.length; i++) {
            System.out.println("Sentence " + (i + 1) + ": " + SENTENCE[i]);
        }
        return SENTENCE;
    }

    public List<String> readFile() throws IOException {
        List<String> listOfText=new ArrayList<>();
        String[] text = getTextFromFile();
        List longestWordsList=findLongestWord();
        Pattern pattern = Pattern.compile("\\b[aieuoAIEOU]\\w+");
        String str = "";
        int i=0;
        for (String s3 : text) {
            while(i<longestWordsList.size()) {
                str = s3.replaceFirst(pattern.pattern(), (String) longestWordsList.get(i));
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
            String biggestWord = Collections.max(strings, Comparator.comparing(String::length));
            list.add(biggestWord);
            System.out.println(biggestWord);

        }
        return list;

    }


}

