import java.util.Scanner;

public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the array size and elements
        System.out.print("Enter the number of rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Take user input for target
        System.out.print("Enter the target value to found: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D indices

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;  // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return false;
    }
}

/*
I/P:
    Enter the number of rows of matrix: 2
    Enter the number of columns of matrix: 2
    Enter elements of the matrix:
    1 3 4 5
    Enter the target value to found: 3
O/P:
    Target found: true
*/