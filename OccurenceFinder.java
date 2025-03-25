import java.util.Scanner;

class OccurenceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size and array elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking user input for the target value
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Making a call to functions to find the first and last occurrence
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }

    // Function to find the first occurrence of the target
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                // Search on the left side
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid;
                // Search on the right side
                left = mid + 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return last;
    }
}

/*
I/P:
    Enter the number of elements: 5
    Enter the sorted array elements:
    5 8 8 10 15
    Enter the target value: 8
O/P:
    First occurrence: 1
    Last occurrence: 2
*/