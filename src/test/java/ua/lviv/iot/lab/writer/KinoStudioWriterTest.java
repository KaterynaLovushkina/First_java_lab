package ua.lviv.iot.lab.writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class KinoStudioWriterTest {

    @Test
    void writeToFile1() throws IOException {
        try(FileReader expectedReader= new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/src/test/resources/expected1.csv");
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            FileReader result = new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/result1.csv");
            BufferedReader actualBR = new BufferedReader(result);
        ){
            Assertions.assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
    }

    @Test
    void writeToFile2() throws IOException{
        try(FileReader expectedReader= new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/src/test/resources/expected2.csv");
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            FileReader result = new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/result2.csv");
            BufferedReader actualBR = new BufferedReader(result);
        ){
            Assertions.assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
    }

    @Test
    void writeToFile3() throws IOException{
        try(FileReader expectedReader= new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/src/test/resources/expected3.csv");
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            FileReader result = new FileReader("/Users/katerina.../Desktop/Projects/java/example/lab5-6/result3.csv");
            BufferedReader actualBR = new BufferedReader(result);
        ){
            Assertions.assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
    }
}