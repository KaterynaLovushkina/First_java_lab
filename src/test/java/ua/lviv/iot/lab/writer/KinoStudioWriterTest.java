package ua.lviv.iot.lab.writer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KinoStudioWriterTest {
    final File file1=new File( "src/test/resources/expected1.csv");
    final File file2=new File("result1.csv");
    final File file3=new File("src/test/resources/expected2.csv");
    final File file4=new File("result2.csv");
    final File file5=new File("src/test/resources/expected3.csv");
    final File file6=new File("result3.csv");

    @Test
    void testWriteToFile1() throws IOException {
        try(Reader expectedReader= new FileReader(file1, StandardCharsets.UTF_8);
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            Reader result = new FileReader(file2, StandardCharsets.UTF_8);
            BufferedReader actualBR = new BufferedReader(result)
        ){
            assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testWriteToFile2() throws IOException{
        try(Reader expectedReader= new FileReader(file3,StandardCharsets.UTF_8);
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            Reader result = new FileReader(file4,StandardCharsets.UTF_8);
            BufferedReader actualBR = new BufferedReader(result)
        ){
            assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testWriteToFile3() throws IOException{
        try(Reader expectedReader= new FileReader(file5,StandardCharsets.UTF_8);
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            Reader result = new FileReader(file6,StandardCharsets.UTF_8);
            BufferedReader actualBR = new BufferedReader(result)
        ){
            assertEquals(expectedBR.readLine(),actualBR.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}