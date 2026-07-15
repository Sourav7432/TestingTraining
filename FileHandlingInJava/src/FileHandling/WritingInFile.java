package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("/Users/souravkumar/Downloads/SK/Files/sample_text_file.txt");

            myWriter.write("Hello, Welcome to Java File Handling.\n");
            myWriter.write("This is the first line.\n");
            myWriter.write("This is the second line.\n");
            myWriter.write("Thank you!");

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}