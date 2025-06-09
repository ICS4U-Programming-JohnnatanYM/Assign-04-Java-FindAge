import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads names and ages from a file,
 * checks if each person is a minor or adult using OOP,
 * and writes the results to an output file.
 *
 * @author Johnnatan Yasin Medina
 * @version 1.0
 * @since 2025-06-03
 */
public final class Main {

    /**
     * This is to satisfy style checker.
     *
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <inputFileName>");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = "output.txt";

        try (
            Scanner scanner = new Scanner(new File(inputFileName));
            FileWriter writer = new FileWriter(outputFileName)
        ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (!line.isEmpty() && line.contains(",")) {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();

                    try {
                        Person person = new Person(name,
                         Integer.parseInt(parts[1].trim()));

                        String result;
                        if (person.isMinor()) {
                            result = person.getName() + " is a Minor";
                        } else {
                            result = person.getName() + " is an Adult";
                        }

                        System.out.println(result);
                        writer.write(result + "\n");

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age for line: " + line);
                    }
                } else {
                    System.out.println("Invalid format for line: " + line);
                }
            }

            System.out.println("Output written to output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File \""
             + inputFileName + "\" not found.");
        } catch (IOException e) {
            System.out.println("Error writing to output.txt.");
        }
    }
}
