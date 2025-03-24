import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        // Take input for each string
        System.out.print("Enter the strings: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        // Call method to concatenate strings
        String result = concatenate(arr);

        // Print the concatenated result
        System.out.println("Concatenated String: " + result);
    }

    // Method to concatenate strings efficiently using StringBuffer
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            // Append each string
            sb.append(str);
        }

        // Convert to string and return
        return sb.toString();
    }
}
/*
I/P:
    Enter the number of strings: 2
    Enter the strings: hello
    world
O/P:
    Concatenated String: hello world
*/