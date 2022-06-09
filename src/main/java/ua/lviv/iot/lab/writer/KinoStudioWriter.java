package ua.lviv.iot.lab.writer;


import ua.lviv.iot.lab.rest.models.PositionInformation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class KinoStudioWriter {
    public static void writeToFile(final
                                    List<PositionInformation> members,

                                    final String fileName)

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