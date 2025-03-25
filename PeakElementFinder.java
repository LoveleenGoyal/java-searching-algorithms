import java.util.Scanner;

public class PeakElementFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the array size and elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = findPeakElement(arr);
        System.out.println("Peak element: " + peak);
    }

    // Method to find peak element
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }

            // If the left neighbor is greater, search the left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else { // Otherwise, search the right half
                left = mid + 1;
            }
        }
        // This will never be reached if the input array is valid
        return -1;
    }
}
