import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take user input for array elements
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = indexOfNegativeNumber(arr);
        if (index < 0) {
            System.out.println("No negative number found");
        } else {
            System.out.println("First negative number found at index " + index);
        }
    }

    // Method to find the index of first negative number
    public static int indexOfNegativeNumber(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
/*
I/P:
    Enter the number of elements: 5
    Enter the elements: 9 -1 -2 3 4
O/P:
    First negative number found at index 1
*/