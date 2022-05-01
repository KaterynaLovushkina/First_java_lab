package ua.lviv.iot.lab.writer;
import ua.lviv.iot.lab.models.PositionInformation;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class KinoStudioWriter {
    public static void writeToFile1(final
                                    List<PositionInformation> members)
                                    throws IOException {
        try (Writer writer = new FileWriter("result1.csv",
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
    public static void writeToFile2(
                                    final List<PositionInformation> members)
                                    throws IOException {
        try (Writer writer = new FileWriter("result2.csv",
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
    public static void writeToFile3(
                                    final List<PositionInformation> members)
                                    throws IOException {
        try (Writer writer = new FileWriter("result3.csv",
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

