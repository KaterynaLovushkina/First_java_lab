package ua.lviv.iot.lab.writer;
import ua.lviv.iot.lab.models.PositionInformation;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class KinoStudioWriter {
    public static void writeToFile(final
                                    List<PositionInformation> members,
                                    String fileName)
                                    throws IOException {
        File file = new File(fileName + ".csv");
        try (Writer writer = new FileWriter(file,
                StandardCharsets.UTF_8)) {
            String previousClassName = "";
            for (var member : members) {
                if (!member.getClass()
                        .getSimpleName()
                        .equals(previousClassName)) {
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