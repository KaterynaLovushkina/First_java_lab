package ua.lviv.iot.lab.writer;

import ua.lviv.iot.lab.models.DataBase;
import ua.lviv.iot.lab.models.PositionInformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KinoStudioWriter {
    public static void writeToFile1(List<PositionInformation> members) throws IOException {
        try (FileWriter writer = new FileWriter("result1.csv")) {
            String previousClassName = "";
            for (var member : members) {
                if (!member.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(member.getHeaders());
                    writer.write("\r\n");
                    previousClassName = member.getClass().getSimpleName();
                }
                writer.write(member.toCSV());
                writer.write("\r\n");

            }
        }
    }
    public static void writeToFile2(List<PositionInformation> members) throws IOException {
        try (FileWriter writer = new FileWriter("result2.csv")) {

            String previousClassName = "";
            for (var member : members) {
                if (!member.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(member.getHeaders());
                    writer.write("\r\n");
                    previousClassName = member.getClass().getSimpleName();
                }
                writer.write(member.toCSV());
                writer.write("\r\n");

            }
        }
    }
    public static void writeToFile3(List<PositionInformation> members) throws IOException {
        try (FileWriter writer = new FileWriter("result3.csv")) {

            String previousClassName = "";
            for (var member : members) {
                if (!member.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(member.getHeaders());
                    writer.write("\r\n");
                    previousClassName = member.getClass().getSimpleName();
                }
                writer.write(member.toCSV());
                writer.write("\r\n");

            }
        }
    }
}

