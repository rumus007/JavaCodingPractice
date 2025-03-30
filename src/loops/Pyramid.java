package src.loops;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of levels you want to print");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            //initial loop

            for (int j = 0; j < levels - i; j++) {
                // for printing the trailing spaces
                // Logic: The number of spaces to be print is (no of levels) - the loop value of i
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i) - 1; k++) {
                // for print the number of *
                // Logic: The number of * to be printed in every loop is (2 X the loop value) - 1
                System.out.print("*");
            }

            //print a new line
            System.out.println();
        }
        scanner.close();
    }
}