package ua.lviv.iot.lab.writer;


import org.junit.Assert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab.models.DataBase;
import ua.lviv.iot.lab.models.MemberForTemporaryJob;
import ua.lviv.iot.lab.models.PositionInformation;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KinoStudioWriterTest {
    List<PositionInformation> members;
    List<PositionInformation> emptyList=new ArrayList<>();;
    final File file1=new File("result1.csv");
    final File file2=new File("result2.csv");
    final File file3=new File("result3.csv");
    @BeforeEach
    public  void setList(){
        members=new ArrayList<>();
        members.add(new MemberForTemporaryJob("production designer", "Lesya",
                28, "bachelor", 5, 350, 6));
        members.add(new MemberForTemporaryJob("operator", "Oleksandr",
                35, "master", 11, 550, 6));
        members.add(new MemberForTemporaryJob("actress", "Nina", 25,
                "bachelor", 4, 400, 5));
        members.add(new MemberForTemporaryJob("actor", "Oleg", 50,
                "master", 20, 1000, 4));
    }
    @Test
    public void testWriteToCSVfile1() throws IOException {
          KinoStudioWriter writer = new KinoStudioWriter();
          writer.writeToFile(DataBase.getMembers(),"expected1");

            Path actualPath = file1.toPath();
            Path expectedPath = Paths.get("expected1.csv");

            List<String> actualString = Files.readAllLines(actualPath);
            List<String> expectedString = Files.readAllLines(expectedPath);

            assertEquals(actualString, expectedString);


            Assert.assertEquals(actualString, expectedString);

    }
    @Test
    public void testWriteToCSVfile2() throws IOException {
        KinoStudioWriter writer = new KinoStudioWriter();
        writer.writeToFile(members,"expected2");

        Path actualPath = file2.toPath();
        Path expectedPath = Paths.get("expected2.csv");

        List<String> actualString = Files.readAllLines(actualPath);
        List<String> expectedString = Files.readAllLines(expectedPath);

       assertEquals(actualString, expectedString);

        Assert.assertEquals(actualString, expectedString);

    }
    @Test
    public void testWriteToCSVfile3() throws IOException {
        KinoStudioWriter writer = new KinoStudioWriter();
        writer.writeToFile(emptyList,"expected3");
        Path actualPath = file3.toPath();
        Path expectedPath = Paths.get("expected3.csv");
        List<String> actualString = Files.readAllLines(actualPath);
        List<String> expectedString = Files.readAllLines(expectedPath);

        assertEquals(actualString, expectedString);

        Assert.assertEquals(actualString, expectedString);

    }


}