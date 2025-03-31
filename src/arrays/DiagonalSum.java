package src.arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Step 1: Read the size of the matrix
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();

        // Step 2: Declare and initialize the matrix
        int[][] twoDimentionalArr = new int[n][n];

        // Step 3: Read the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimentionalArr[i][j] = scanner.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int diagonalSum = 0;

        for (int i = 0; i < twoDimentionalArr.length; i++) {
            // condition for primary diagonal
            primaryDiagonalSum += twoDimentionalArr[i][i];

            // condition for secondary diagonal
            if(i != n-1-i){
                secondaryDiagonalSum += twoDimentionalArr[i][n-1-i];
            }
        }

        diagonalSum = primaryDiagonalSum + secondaryDiagonalSum;
        System.out.format("The Primary diagonal sum is: %d %n", primaryDiagonalSum);
        System.out.format("The Secondary diagonal sum is: %d %n", secondaryDiagonalSum);
        System.out.format("The Diagonal sum is: %d %n", diagonalSum);

        scanner.close();
    }
}
