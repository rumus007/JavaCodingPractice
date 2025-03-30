import java.util.Scanner;

/**
 * Code for printing fibonacci sequence upto the range provided by user
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci sequence to be printed: ");
        int range = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
