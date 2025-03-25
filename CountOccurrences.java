import java.io.*;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for file name and target word
        System.out.print("Enter the file name (with path if needed): ");
        String filename = sc.nextLine();

        System.out.print("Enter the word to count: ");
        String targetWord = sc.next();

        // Count occurrences of the word
        int count = countWordOccurrences(filename, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");

        sc.close(); // Close Scanner
    }

    public static int countWordOccurrences(String filename, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) { // Read each line
                String[] words = line.split("\\s+|\\p{Punct}"); // Split by spaces & punctuation
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Case-insensitive comparison
                        count++;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }

        return count;
    }
}

/*
I/P:
    Enter the file name (with path if needed): ./ReadAFile.java
    Enter the word to count: public
O/P:
    The word 'public' appears 3 times in the file.
*/