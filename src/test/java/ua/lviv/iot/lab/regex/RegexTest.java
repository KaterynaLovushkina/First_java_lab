package ua.lviv.iot.lab.regex;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegexTest {
    Regex regex=new Regex("/Users/katerina.../Documents/Projects/java/example/lab7/workFile.txt");

    @Test
    void testGetTextFromFile() throws IOException {
        List<String> expected = Arrays.asList(
                "A beautiful and heart-warming tale of the March sisters .",
                "Little Women is a classic , loved by young and old alike .",
                "It explores timeless themes of love and death .",
                "War and peace .",
                "The conflict between personal ambition and family responsibilities .",
                "The clash of cultures between Europe and America .");
        List<String> actual = Arrays.asList(regex.getTextFromFile());
        assertEquals(expected, actual);
    }

    @Test
    void testFindLongestWord() throws IOException {
        List<String> actual = regex.getListOfLongestWordsInText();
        List<String> expected = Arrays.asList("heart-warming", "classic",
                                              "explores", "peace",
                                              "responsibilities", "cultures");
        assertEquals(expected, actual);
    }
    @Test
    void testReplaceWordsInFile() throws IOException {
        Set<String> actual =  regex.replaceWordsInFile();
        Set<String> expected = Sets.newHashSet(
                "A beautiful heart-warming heart-warming tale of the March sisters .",
                "Little Women classic a classic , loved by young and old alike .",
                "explores explores timeless themes of love and death .",
                "War peace peace .",
                "The conflict between personal responsibilities and family responsibilities .",
                "The clash cultures cultures between Europe and America .");
        assertEquals(expected, actual);
    }


}