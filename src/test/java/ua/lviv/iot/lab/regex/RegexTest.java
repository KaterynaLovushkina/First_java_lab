package ua.lviv.iot.lab.regex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {
    Regex regex=new Regex("/Users/katerina.../Documents/Projects/java/example/lab5-6/workFile.txt");

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
        List<String> actual = regex.findLongestWord();
        List<String> expected = Arrays.asList("heart-warming", "classic",
                                              "explores", "peace",
                                              "responsibilities", "cultures");
        assertEquals(expected, actual);
    }
    @Test
    void testReadFile() throws IOException {
        List<String> actual = regex.readFile();
        List<String> expected = Arrays.asList(
                "A beautiful heart-warming heart-warming tale of the March sisters .",
                "Little Women classic a classic , loved by young and old alike .",
                "explores explores timeless themes of love and death .",
                "War peace peace .",
                "The conflict between personal responsibilities and family responsibilities .",
                "The clash cultures cultures between Europe and America .");
        assertEquals(expected, actual);
    }


}