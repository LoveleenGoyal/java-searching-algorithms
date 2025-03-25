import java.io.*;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the filename
        System.out.print("Enter the file name (with path if needed): ");
        String filename = sc.nextLine();

        // Read and print the file content
        readFile(filename);

        sc.close(); // Close Scanner
    }

    public static void readFile(String filename) {
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) { // Read each line
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
/*
I/P:
Enter the file name (with path): ./README.md

O/P:
# Java Searching algorithms
*/